package br.com.fiap.pontonow.controllers;


import java.util.List;

import javax.naming.Binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.pontonow.models.RestValidationErros;
import br.com.fiap.pontonow.models.Cadastro;
import br.com.fiap.pontonow.repository.CadastroRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;



@RestController
@RequestMapping("/api/cadastro")
public class CadastroControllers {
    Logger log = LoggerFactory.getLogger(AcessoControllers.class);

    @Autowired
    CadastroRepository repository;

    
    @GetMapping
    public  List<Cadastro> index(){
         return repository.findAll(); 
        
    }

    @PostMapping
    public ResponseEntity <Object> create(@RequestBody @Valid Cadastro cadastro, BindingResult result){
       // if(result.hasErrors()) return ResponseEntity.badRequest().body(new RestValidationErros("erro de validação"));
        log.info("Acesso do usuario" + cadastro);

        repository.save(cadastro);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastro);
    }
    /**
     * @param id
     * @return
     */

    @GetMapping(value="{id}")
    public ResponseEntity<Cadastro> show(@PathVariable Long id) {
        log.info("Buscando Cadastro com id " + id);
        var cadastroEncontrado = repository.findById(id);

        if(cadastroEncontrado.isEmpty())

            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(cadastroEncontrado.get());

    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Cadastro> destroy(@PathVariable Long id){
        log.info("Apagando Cadastro com id " + id);
        var cadastroEncontrado = repository.findById(id);

        if (cadastroEncontrado.isEmpty())

            return ResponseEntity.notFound().build();

        repository.delete(cadastroEncontrado.get());

        return ResponseEntity.noContent().build();
        
    }

    @PutMapping("{id}")
    public ResponseEntity<Cadastro> update(@PathVariable Long id, @RequestBody @Valid Cadastro cadastro){

        log.info("Atualizando cadastro com id " + id);
        var cadastroEncontrado = repository.findById(id);

        if (cadastroEncontrado.isEmpty())
            return ResponseEntity.notFound().build();
        
        cadastro.setId(id);
        repository.save(cadastro);

        return ResponseEntity.ok(cadastro);

    }
    
}

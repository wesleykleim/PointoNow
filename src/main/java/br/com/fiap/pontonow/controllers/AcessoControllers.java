package br.com.fiap.pontonow.controllers;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pontonow.models.Acesso;
import br.com.fiap.pontonow.repository.AcessoRepository;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/acesso")
public class AcessoControllers {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    AcessoRepository repository;

    
    @GetMapping
    public  List<Acesso> index(){
         return repository.findAll(); 
        
    }

    @PostMapping
    public ResponseEntity <Acesso> create(@RequestBody @Valid Acesso acesso){
       // if(result.hasErrors()) return ResponseEntity.badRequest().body(new RestValidationErros("erro de validação"));
        log.info("Acesso do usuario" + acesso);

        repository.save(acesso);
        return ResponseEntity.status(HttpStatus.CREATED).body(acesso);
    }
    /**
     * @param id
     * @return
     */

    @GetMapping(value="{id}")
    public ResponseEntity<Object> show(@PathVariable Long id) {
        log.info("Buscando Cadastro com id " + id);
        return ResponseEntity.ok(getAcesso(id));

    }

    private Object getAcesso(Long id) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Acesso> destroy(@PathVariable Long id){
        log.info("Apagando cadastro com id " + id);
        repository.delete((Acesso) getAcesso(id));

        return ResponseEntity.noContent().build();
        
    }

    @PutMapping("{id}")
    public ResponseEntity<Acesso> update(@PathVariable Long id, @RequestBody @Valid Acesso cadastro){

        log.info("Atualizando acesso com id " + id);
        var cadastroEncontrado = repository.findById(id);

        if (cadastroEncontrado.isEmpty())
            return ResponseEntity.notFound().build();
        
        cadastro.setId(id);
        repository.save(cadastro);

        return ResponseEntity.ok(cadastro);

    }
    
}

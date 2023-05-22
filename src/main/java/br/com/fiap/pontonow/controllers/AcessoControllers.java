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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pontonow.models.Acesso;
import br.com.fiap.pontonow.repository.AcessoRepository;
import jakarta.validation.Valid;



@RestController
@Tag("auth")
@RequestMapping("/api/acesso")
public class AcessoControllers {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    AcessoRepository repository;

    
    /**
     * @param nome
     * @param tamanho
     * @param pagina
     * @return
     */
    @GetMapping
    public  List<Acesso> index(
        @RequestParam(required = false) String nome, 
        @RequestParam (defaultValue = "10") int tamanho,
        @RequestParam(defaultValue = "0") int pagina
    ) {
        if (nome == null) return repository.listarTodasPaginado(tamanho, pagina*tamanho);
         return repository.findByNomeContaining(nome); 
        
    }
    @Autowired 
    TokenService tokenService;

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
    @DeleteMapping("/api/resgisdtra")
    publicx ResponseEntity<Usuario> resgistrar(@RequestBody @Valid Usuario usuario){
        usuario.setSenha(encode(usuario.getSenha()));
        repository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }
    

    @PutMapping("/api/login")
    public ResponseEntity<Object> login(@RequestBody @Valiod Credencial credencial){
        manager.authenticate(credencial.toAuthentication());

        var token = tokenService.genereteToken(credencial);
        return ResponseEntity.ok(token);
        
    }
    
}

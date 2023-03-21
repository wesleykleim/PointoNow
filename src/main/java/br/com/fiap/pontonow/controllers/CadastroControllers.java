package br.com.fiap.pontonow.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.fiap.pontonow.models.Cadastro;

@Controller
public class CadastroControllers {
    Logger log = LoggerFactory.getLogger(AcessoControllers.class);
    List<Cadastro> cadastros = new ArrayList<>();
    @GetMapping("/api/cadastro")
   
    public  List<Cadastro> index(){
        
         return cadastros; 
        
    }

    @PostMapping("/api/cadsatro")
    public void create(@RequestBody Cadastro cadastro){
        log.info("Acesso do usuario" + cadastro);
        cadastros.add(cadastro);
    }
}

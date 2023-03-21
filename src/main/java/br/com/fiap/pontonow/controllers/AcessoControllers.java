package br.com.fiap.pontonow.controllers;


import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.pontonow.models.Acesso;


@Controller
public class AcessoControllers {

    Logger log = LoggerFactory.getLogger(AcessoControllers.class);
   

    @RequestMapping("/api/acesso")
    @ResponseBody
    public Acesso show(){
        Acesso acesso = new Acesso("Wesley Novais Kleim", "1@2#3#wesley", LocalDate.now());
        return acesso;
    }

    @PostMapping("/api/acesso")
    public void create(@RequestBody String acesso){
        log.info("Acesso do usuario" + acesso);
    }
    
}

package br.com.fiap.pontonow.controllers;









import java.time.LocalDate;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import br.com.fiap.pontonow.models.Acesso;


@Controller
public class AcessoControllers {

    Logger log = LoggerFactory.getLogger(AcessoControllers.class);
   

    @GetMapping("/api/acesso")
    public Acesso show(){
        Acesso acesso = new Acesso("wesleykleimdev@gmail.com", "1@2#3$Wesley", "redefinir a Senha", LocalDate.now(), LocalTime.now());
        return acesso;
    }

    @PostMapping("/api/acesso")
    public void create(@RequestBody String acesso){
        log.info("Acesso do usuario" + acesso);
    }
    
}

package br.com.fiap.pontonow.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.pontonow.models.Acesso;


@Controller
public class AcessoControllers {

    @RequestMapping("/api/acesso")
    @ResponseBody
    public Acesso show(){
        Acesso acesso = new Acesso("wesleykleimdev@gmail.com", "1@2#3$Wesley", "redefinir a Senha", 2023, 03, 12, null);
        return acesso;
    }

    
    
}

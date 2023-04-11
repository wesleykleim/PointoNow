package br.com.fiap.pontonow.config;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.pontonow.models.Acesso;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    AcessoRepository acessoRepository;

    @Override
    public void run(String... args) throws Exception {
        acessoRepository.saveAll(List.of(
            new Acesso (1L, "wesleykleim@gmail.com" ,new String(30), "login");
            new Acesso( 2L, "@#$W05050505" ,new String(8), "senha");
            new Acesso(3L, "10/04/2023", new Date(), "data");
        ));
    }
    
}

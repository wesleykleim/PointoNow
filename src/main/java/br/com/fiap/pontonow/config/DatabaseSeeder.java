package br.com.fiap.pontonow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    AcessoRepository acessoRepository;

    @Override
    public void run(String... args) throws Exception {
        acessoRepository.save()
    }
    
}

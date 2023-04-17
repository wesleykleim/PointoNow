package br.com.fiap.pontonow.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.pontonow.models.Acesso;
import br.com.fiap.pontonow.models.Cadastro;
import br.com.fiap.pontonow.repository.CadastroRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    AcessoRepository acessoRepository;

    @Autowired
    CadastroRepository cadastroRepository;

    @Override
    public void run(String... args) throws Exception {
        
            Acesso a1 = new Acesso(1L, "wesleykleim@gmail.com","123@#W" );
            Acesso a2 = new Acesso(2L, "jorgerodrigo@gmail.com","666@#Jr" );
             acessoRepository.saveAll(List.of(a1,a2));

        cadastroRepository.saveAll(List.of(
            Cadastro.builder().cpf("427405028").nome("Wesley kleim").cargo("Desenvolvedor Java").acesso(a1).build()));
    }
    

    
}

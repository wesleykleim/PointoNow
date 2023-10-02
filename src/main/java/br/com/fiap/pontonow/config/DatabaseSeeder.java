import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.fiap.meujulius.models.Conta;
import br.com.fiap.meujulius.models.Despesa;
import br.com.fiap.meujulius.models.Usuario;
import br.com.fiap.meujulius.repository.ContaRepository;
import br.com.fiap.meujulius.repository.DespesaRepository;
import br.com.fiap.meujulius.repository.UsuarioRepository;

import java.util.List;

@@-25,11+28,24 @@

public class DatabaseSeeder implements CommandLineRunner {
    @Autowired
    DespesaRepository despesaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
     public void run(String... args) throws Exception {

    contaRepository.saveAll(List.of(c1,c2,c3));

    despesaRepository.saveAll(List.of(
         Usuario u1 = new Usuario(1L, "Wesley", "joao@fiap.com.br", encoder.encode("123456"));
        Usuario u2 = new Usuario(2L, "Rodrigo", "maria@fiap.com.br", encoder.encode("123456"));

        usuarioRepository.save(u1);
        usuarioRepository.save(u2);

      

    ))}}
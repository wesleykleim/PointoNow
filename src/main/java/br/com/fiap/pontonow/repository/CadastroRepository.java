package br.com.fiap.pontonow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Conta;
import br.com.fiap.pontonow.models.Usuario;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

    List<Cadastro> findByUsuario(Usuario user);

}

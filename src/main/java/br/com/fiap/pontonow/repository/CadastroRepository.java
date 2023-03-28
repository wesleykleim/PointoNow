package br.com.fiap.pontonow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
    
}

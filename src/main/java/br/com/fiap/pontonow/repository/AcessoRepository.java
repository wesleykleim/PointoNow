package br.com.fiap.pontonow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Acesso;

public interface AcessoRepository extends JpaRepository<Acesso, Long>{
    
}

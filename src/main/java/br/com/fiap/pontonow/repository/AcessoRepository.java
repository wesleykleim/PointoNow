package br.com.fiap.pontonow.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Acesso;

public interface AcessoRepository extends JpaRepository<Acesso, Long>{

    List<Acesso> findByNomeContaining(String nome);

    List<Acesso> listarTodasPaginado(int tamanho, int i);

    Object findAllById(Pageable pageable);

    Object findAll(Pageable pageable);
    
}

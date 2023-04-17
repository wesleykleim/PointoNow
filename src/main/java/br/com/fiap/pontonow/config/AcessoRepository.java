package br.com.fiap.pontonow.config;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.pontonow.models.Acesso;

public interface AcessoRepository extends JpaRepository<Acesso, Long>{

   
   List<Acesso> findByNomeContaining(String nome );


   @Query("SELECT a FROM Acesso a ORDER BY a.id LIMIT %1 OFFSET ?2")
   List<Acesso> listarTodasPaginado(int tamanho, int offset);

}

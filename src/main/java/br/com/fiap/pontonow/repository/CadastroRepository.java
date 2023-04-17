package br.com.fiap.pontonow.repository;

import java.util.List;

/*import java.time.LocalDate;
import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

    void saveAll(List<Object> of);
   /* List<Cadastro>findByData(LocalDate data);
   */ 
}

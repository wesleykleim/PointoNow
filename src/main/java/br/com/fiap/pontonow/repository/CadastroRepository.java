package br.com.fiap.pontonow.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pontonow.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
   /* List<Cadastro>findByData(LocalDate data);
   */ 
}

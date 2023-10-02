package br.com.fiap.pontonow.models;
import java.math.BigDecimal;
public record CadastroDto(
    Long id,
    String nome,
    String endereco,
    String cpf
 
  
) {

public ContaDto(Cadastro cadastro, String nome, String endereco, String cpf){
        this(cadastro.getId(), cadastro.getNome(), cadastro.getEndereco(), nome, endereco, cpf);
    }
}
package br.com.fiap.pontonow.models;
import java.math.BigDecimal;

public record CadastroDto (
    Long id,
    String nome,
    String cpf,
    String funcao

){
    public ContaDto(Conta conta, saldo){
        this(conta.getId(), conta.getNome(), conta.getIcone, saldo);
    }
}

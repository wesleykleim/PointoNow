package br.com.fiap.pontonow.models;



public class Cadastro {

    private String Nome;
    private String cpf;

    
    public Cadastro(String nome, String cpf) {
        Nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return Nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}

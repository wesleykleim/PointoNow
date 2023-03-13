package br.com.fiap.pontonow.models;



public class Cadastro {

    private String Nome;
    private String cpf;
    private String sexo;
    private String cargo;
    public Cadastro(String nome, String cpf, String sexo, String cargo) {
        Nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cargo = cargo;
    }
    public String getNome() {
        return Nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return "Cadastro [Nome=" + Nome + ", cpf=" + cpf + ", sexo=" + sexo + ", cargo=" + cargo + "]";
    }
  
    
    
    
 

    
    
}

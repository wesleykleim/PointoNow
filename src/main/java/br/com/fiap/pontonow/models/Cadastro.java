package br.com.fiap.pontonow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cadastro {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String cpf;
    private String sexo;
    private String cargo;

    protected Cadastro(){
        
    }
    public Cadastro(String nome, String cpf, String sexo, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cargo = cargo;
    }
    public Long getId(){
        return id;
    }
    public String getNome() {
        return nome;
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

    public void setId(Long id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
        return "Cadastro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", cargo=" + cargo + "]";
    }
    
  
    
    
    
 

    
    
}

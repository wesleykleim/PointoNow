package br.com.fiap.pontonow.models;


import java.util.List;


import org.springframework.hateoas.EntityModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Cadastro extends EntityModel<Cadastro> {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @NotBlank @Size(min = 9, max = 11)
    private String cpf;

    @NotBlank @Size(min = 20, max = 60)
    private String nome;
    
    @NotBlank @Size(max = 1)
    private String sexo;

    @NotBlank @Size(min = 20, max = 60)
    private String cargo;

    public Cadastro(){
        
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
    
  
    
    /**
     *
     */
    @jakarta.persistence.OneToOne
    List<Acesso> acessos;

    public static Object builder() {
        return null;
    }
    public EntityModel<Cadastro> toEntityModel(){
        return EntityModel.of(

        cadastro,
            linkTo(methodOn(CadastroControllers.class).show(id).withSelfRel(),
            linkTo(methodOn(CadastroControllers.class).destroy(id).withSelfRel("delete"),
            linkTo(methodOn(CadastroControllers.class).index(null, Pageable.unpaged())).withSelfRel("all"),
            linkTo(methodOn(CadastroControllers.class).index(cadastro.getAcesso().getId())).withRel("acesso")
           );
    
    
            
        )
       
    }
  

    
    
}

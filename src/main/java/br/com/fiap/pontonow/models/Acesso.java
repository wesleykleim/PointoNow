package br.com.fiap.pontonow.models;



import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor


public class Acesso {

    public Acesso(long l, String string, String string2) {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Size(min = 10, max = 30)
    private String usuario;

    @NotBlank @Size(min = 8, max = 15)
    private String senha;


    
    private Cadastro cadastro;

   
    
    
    }

   

    
    

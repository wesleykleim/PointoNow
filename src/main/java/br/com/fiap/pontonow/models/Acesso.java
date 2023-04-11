package br.com.fiap.pontonow.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor


public class Acesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Size(min = 10, max = 30)
    private String usuario;

    @NotBlank @Size(min = 8, max = 15)
    private String senha;


    private LocalDate data;
    

    @ManyToOne
    private Cadastro cadastro;

   
    
    
    }

   

    
    

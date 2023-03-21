package br.com.fiap.pontonow.models;

import java.time.LocalDate;


public class Acesso {

    private String usuario;
    private String senha;
    private LocalDate data;
    


    public Acesso(String usuario, String senha, LocalDate data) {
        this.usuario = usuario;
        this.senha = senha;
        this.data = data;
        
    }
    public String getUsuario() {
        return usuario;
    }
    public String getSenha() {
        return senha;
    }
    public LocalDate getData() {
        return data;
    }
  
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Acesso [usuario=" + usuario + ", senha=" + senha + ", data=" + data + "]";
    }
   
   
    
    
    }

   

    
    

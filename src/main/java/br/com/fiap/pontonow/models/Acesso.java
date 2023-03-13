package br.com.fiap.pontonow.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Acesso {

    private String usuario;
    private String senha;
    private String esqueciSenha;
    private LocalDate data;
    private LocalTime hora;
    public Acesso(String usuario, String senha, String esqueciSenha, int ano, int mes, int dia, LocalDate dataHorDate) {
        this.usuario = usuario;
        this.senha = senha;
        this.esqueciSenha = esqueciSenha;
        this.data = LocalDate.of(ano, mes, dia);
        this.hora = LocalTime.now();
    }
    public String getUsuario() {
        return usuario;
    }
    public String getSenha() {
        return senha;
    }
    public String getEsqueciSenha() {
        return esqueciSenha;
    }
    public LocalDate getData() {
        return data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setEsqueciSenha(String esqueciSenha) {
        this.esqueciSenha = esqueciSenha;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
    }

   

    
    

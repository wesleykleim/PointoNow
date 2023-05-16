package br.com.fiap.pontonow.models;

public record Token(
    String token,
    String type,
    String prefix
){}
package br.com.fiap.pontonow.exception;

public class RestNotFoundException  extends RuntimeException{
    public RestNotFoundException(String message){
    super(message);
    }
    
}

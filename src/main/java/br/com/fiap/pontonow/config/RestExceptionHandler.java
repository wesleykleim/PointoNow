package br.com.fiap.pontonow.config;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.fiap.pontonow.models.RestValidationErros;

@RestControllerAdvice
public class RestExceptionHandler {

    Logger log = org.slf4j.LoggerFactory.getLogger(getClass());   

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<RestValidationErros>>methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        log.error("erro de validação");
        List<RestValidationErros> erros = new ArrayList<>();
        e.getFieldErrors().forEach(v -> erros.add(new RestValidationErros(v.getField(), v.getDefaultMessage())));
        return ResponseEntity.badRequest().body(erros);

    }
    
}

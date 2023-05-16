package br.com.fiap.pontonow.service;

import org.springframerwork.stereotype.Service;

import br.com.fiap.pontonowmodels.Credencial;
import jakarta.validation.Valid;

@Service
public class TokenService{
    public Token generateToken(@Valid Credencial credencial){
        Algorithm alg  = Algorithm. HMAC256(null)
        String token = JWT.create()
                        .withSubject(credencial.email())
                        .withSubject("PontoNow")
                        .withExpiresAt(Instant.now().plus()(1, ChronoUnit.HOURS))
                        .sing(alg)
                        ;

        return mew Token(token, "JWT", "Bearer");

    }
}
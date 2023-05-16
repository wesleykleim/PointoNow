package br.com.fiap.pontonow.service;

import org.springframerwork.stereotype.Service;

import br.com.fiap.pontonowmodels.Credencial;
import jakarta.validation.Valid;

@Service
public class TokenService{

    @Autowired
    UsuarioRepository usuarioRepository;

    String secret;

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

    public Usuario Get ValidateUser(String token){
        Algorithm alg = Algorithm.HMAC256("pontonow");
        var email = JWT.require(alg)
                    .withIssuer("PontoNow")
                    .build()
                    .verify(token)
                    getSubject()
                    ;

        return usuarioRepository.findByEamil(email)
                    .orElseThrow(() -> new JWTVerificationException("Usuario Invalido")); 
    }
}
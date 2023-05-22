pakege br.com.fiap.pontonow.config;

import org.springframework.context.annotation.Bean;
import org.springframerwork.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.securyty.SecurityScheme;

@Configuration
public class DocumentationConfig{

    @Bean
    public OpenAPI custonOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                    .title("Ponto Now API"))
                    .version("v1")
                    .desciption("API do app de controle de gastos")
                    .contact(new Contact().name("Wesley Kleim").email("rm94412@fiap.com.br"))
                    .license(new License(.name("MIT OPen Source").url("http://pontonow.com/licenca"))
                    )
                .components(new Components(
                    .addSecuritySchemes("bearer-key",
                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer"))
                            .bearerFormat("JWT")));
    }
}
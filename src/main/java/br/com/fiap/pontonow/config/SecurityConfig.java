import org.springframerwork.security.crypto.password.passwordEncoder;
import org.springframerwork.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{

    @beans
    public SecurityFilterChain filterChain(HttpSecurity http) throwa Exception{
        retun http
        .autorizeHttpRequests()
            .requestMatchers(HttpMethod.POST "/api/registrar").permitAll()
            .requestMatchers(HttpMethod.POST "/api/login").permitAll()
            .requestMatchers("/v3/api-docs/**", "/swagger-ui/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .formLogin().disable()
            .build();
            
    }
}
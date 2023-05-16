import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthorizationFilter extends OncePerRequestFilter{

    @Autowired
    TokenService tokenService;


    @Override
    protected void doFilerInternal(HttpServeLetRequest resquest,HttpServeLetResponse response, FilterChain filterChain )

        thows ServletException, IOException{

            var token = getToken(request);
            if(token != null){
                var usuario = tokenService.getVlidateUser(token);
                Authentication auth = new UsernamePasswordAuthenticationToken(usuario.getEmail(), null, usuario.getAuthorities());
                securityContextHolder.getContext().setAuthentication(auth);
            }

            filterChain.doFilter(request, response);


        }
        private String getToken(HttpServeLetRequest request){
            var header = request.getHeader("Authorization");

            if(header == null || header.isEmpty() || !header.startsWith("Bearer ")){
                retun null
            }
            
            return header.replace("Bearer ", "");
        
        
        }

}
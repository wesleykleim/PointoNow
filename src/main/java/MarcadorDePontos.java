import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MarcadorDePontos {
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    private LocalTime entrada;
    private LocalTime almoco;
    private LocalTime retornoAlmoco;
    private LocalTime saida;

    public void marcarEntrada() {
        entrada = LocalTime.now();
        System.out.println("Entrada registrada às " + entrada.format(TIME_FORMAT));
    }

    public void marcarAlmoco() {
        almoco = LocalTime.now();
        System.out.println("Almoço registrado às " + almoco.format(TIME_FORMAT));
    }

    public void marcarRetornoAlmoco() {
        retornoAlmoco = LocalTime.now();
        System.out.println("Retorno do almoço registrado às " + retornoAlmoco.format(TIME_FORMAT));
    }

    public void marcarSaida() {
        saida = LocalTime.now();
        System.out.println("Saída registrada às " + saida.format(TIME_FORMAT));
    }

    public static void main(String[] args) {
        MarcadorDePontos marcador = new MarcadorDePontos();
        marcador.marcarEntrada();
        marcador.marcarAlmoco();
        marcador.marcarRetornoAlmoco();
        marcador.marcarSaida();
    }
}

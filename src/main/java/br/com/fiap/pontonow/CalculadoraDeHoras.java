package br.com.fiap.pontonow;
import java.util.Scanner;
public class CalculadoraDeHoras {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scanner.nextInt();

        double sobra = 0;
        if(horasTrabalhadas > 8){
        sobra += horasTrabalhadas  - 8;
            System.out.println("Você trabalhou " + horasTrabalhadas + " horas. Precisa agengar para entrar mais tarde ou sair mais cedo.\nVocê possui " + sobra + " Horas positivas!" );
        }

        double falta = 0;
        if(horasTrabalhadas < 8){
            falta += 8 - horasTrabalhadas;
            System.out.println("Você trabalhou " + horasTrabalhadas + " horas. Está devendo horas e precisa pagar essa horas até o final do mês. \nVocê possui " + falta + " Horas negativas!" );
        }

        if(horasTrabalhadas ==  8){
            System.out.println("Você não Possui pendencias");
    }
    }
}



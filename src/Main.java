import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // domingo -> 1
        // segunda --> 2 e por ai vai até sábado
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o dia da semana: ");

        String diaDaSemana = entrada.nextLine();
//       if (diaDaSemana == "domingo") {
//           System.out.println("Seu número é: 1");
//       }

//        if ("domingo".equalsIgnoreCase(diaDaSemana)){
//            System.out.println("Seu número é: 1");
//        }
        if (diaDaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("Seu número é: 1");
        } else if (diaDaSemana.equalsIgnoreCase("segunda")) {
            System.out.println("Seu número é: 2");
        } else if (diaDaSemana.equalsIgnoreCase("terça") || (diaDaSemana.equalsIgnoreCase("terca"))) {
            System.out.println("Seu número é: 3");
        } else if (diaDaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("Seu número é: 4");
        } else if (diaDaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("Seu número é: 5");
        } else if (diaDaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Seu número é: 6");
        } else if (diaDaSemana.equalsIgnoreCase("sábado") || (diaDaSemana.equalsIgnoreCase("sabado"))) {
            System.out.println("Seu número é: 7");
        } else {
            System.out.println("Dia inválido!");
        }
        entrada.close();
    }
}
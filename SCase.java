import java.util.Scanner;

public class SCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um horário do dia:");
        int horario = entrada.nextInt();
        switch (horario) {
            case 1 -> System.out.println("Boa madraguda.");
            case 2 -> System.out.println("Boa madrugada.");
            case 3 -> System.out.println("Boa madrugada.");
            case 4 -> System.out.println("Boa madrugada.");
            case 5 -> System.out.println("Boa madrugada.");
            case 6 -> System.out.println("Bom dia.");
            case 7 -> System.out.println("Bom dia.");
            case 8 -> System.out.println("Bom dia.");
            case 9 -> System.out.println("Bom dia.");
            case 10 -> System.out.println("Bom dia.");
            case 11 -> System.out.println("Bom dia.");
            case 12 -> System.out.println("Bom dia.");
            case 13 -> System.out.println("Boa tarde.");
            case 14 -> System.out.println("Boa tarde.");
            case 15 -> System.out.println("Boa tarde.");
            case 16 -> System.out.println("Boa tarde.");
            case 17 -> System.out.println("Boa tarde.");
            case 18 -> System.out.println("Boa tarde.");
            case 19 -> System.out.println("Boa noite.");
            case 20 -> System.out.println("Boa noite.");
            case 21 -> System.out.println("Boa noite.");
            case 22 -> System.out.println("Boa noite.");
            case 23 -> System.out.println("Boa noite.");
            case 24 -> System.out.println("Boa noite.");
        }
    }
}
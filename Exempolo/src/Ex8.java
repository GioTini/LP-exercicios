import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valorum = entrada.nextInt();

        System.out.println("Por favor, informe mais um valor:");
        int valordois = entrada.nextInt();

        if(valorum % valordois == 0)
            System.out.println("É divisivel.");

        else{
            System.out.println("Não é divisivel.");
        }
    }
}

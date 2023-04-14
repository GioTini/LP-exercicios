import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número:");
        int valor = entrada.nextInt();
        if(valor % 3 == 0)
            System.out.println("Multiplo de três");
        else{
            System.out.println("Não multiplo");
        }
    }
}

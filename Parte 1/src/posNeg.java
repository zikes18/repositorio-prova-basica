
import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        }
        else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        sc.close();
    }

}

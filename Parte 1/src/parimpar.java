
import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }   
        sc.close();
    }
}

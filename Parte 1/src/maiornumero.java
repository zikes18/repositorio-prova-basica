
import java.util.Scanner;

public class maiornumero {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close();
    }

}

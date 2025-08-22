import java.util.Scanner;

public class somawhile {
    public static void main(String[] args) {
        // Soma com while: Peça números ao usuário e some-os até que ele digite 0. No final, mostre a soma total.
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números para somar (digite 0 para finalizar):");
        numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
        sc.close();
        }
    }
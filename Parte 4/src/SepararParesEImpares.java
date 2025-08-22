import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.println("\nNúmeros Pares:");
        if (pares.isEmpty()) {
            System.out.println("Nenhum número par foi digitado.");
        } else {
            for (int par : pares) {
                System.out.println(par);
            }
        }

        System.out.println("\nNúmeros Ímpares:");
        if (impares.isEmpty()) {
            System.out.println("Nenhum número ímpar foi digitado.");
        } else {
            for (int impar : impares) {
                System.out.println(impar);
            }
        }
        scanner.close();
    }
}


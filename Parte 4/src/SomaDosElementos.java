import java.util.Scanner;

public class SomaDosElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        System.out.println("Preencha o vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        System.out.println("A soma de todos os elementos do vetor é: " + soma);
        scanner.close();
    }
}


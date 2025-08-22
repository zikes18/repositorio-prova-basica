import java.util.Scanner;

public class MaiorElementoDoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int maior = Integer.MIN_VALUE;
        System.out.println("Preencha o vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("O maior elemento do vetor é: " + maior);
        scanner.close();
    }
}


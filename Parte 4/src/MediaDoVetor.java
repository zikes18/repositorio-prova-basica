import java.util.Scanner;

public class MediaDoVetor {
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
        double media = (double) soma / vetor.length;
        System.out.println("A média dos elementos do vetor é: " + media);
        scanner.close();
    }
}


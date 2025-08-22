import java.util.Scanner;

public class LerEImprimirVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Preencha o vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        scanner.close();
    }
}


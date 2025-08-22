import java.util.Scanner;

public class UniaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorUniao = new int[10];

        System.out.println("Preencha o primeiro vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor 1 - Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
            vetorUniao[i] = vetor1[i];
        }

        System.out.println("Preencha o segundo vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor 2 - Posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
            vetorUniao[i + 5] = vetor2[i];
        }

        System.out.println("Elementos do vetor de união:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorUniao[i]);
        }
        scanner.close();
    }
}


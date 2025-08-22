import java.util.Scanner;

public class ContarParesNoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contadorPares = 0;
        System.out.println("Preencha o vetor com 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Quantidade de números pares no vetor: " + contadorPares);
        scanner.close();
    }
}


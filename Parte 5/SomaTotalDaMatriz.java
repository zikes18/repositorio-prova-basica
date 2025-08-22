import java.util.Scanner;

public class SomaTotalDaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal = 0;

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nA soma total de todos os elementos da matriz é: " + somaTotal);
        scanner.close();
    }
}


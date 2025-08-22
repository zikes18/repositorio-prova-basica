import java.util.Scanner;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas = 2; // Exemplo de dimensão
        int colunas = 2; // Exemplo de dimensão

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        System.out.println("Preencha a Matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha a Matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Somando as matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nMatriz Soma (A + B):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}


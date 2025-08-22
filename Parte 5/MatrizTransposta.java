import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz:");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = scanner.nextInt();

        int[][] matrizOriginal = new int[linhas][colunas];
        int[][] matrizTransposta = new int[colunas][linhas];

        System.out.println("Preencha a matriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        // Calculando a transposta
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}


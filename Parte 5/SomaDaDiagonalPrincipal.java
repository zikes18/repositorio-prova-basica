import java.util.Scanner;

public class SomaDaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaDiagonalPrincipal = 0;

        System.out.println("Preencha a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        scanner.close();
    }
}


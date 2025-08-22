import java.util.Scanner;

public class VerificarMatrizIdentidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a dimensão da matriz quadrada (ex: 3 para 3x3):");
        int dimensao = scanner.nextInt();
        int[][] matriz = new int[dimensao][dimensao];
        boolean ehIdentidade = true;

        System.out.println("Preencha a matriz:");
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        ehIdentidade = false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        ehIdentidade = false;
                    }
                }
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (ehIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }
        scanner.close();
    }
}


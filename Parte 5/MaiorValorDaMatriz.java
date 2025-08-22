import java.util.Scanner;

public class MaiorValorDaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nO maior valor na matriz é: " + maiorValor);
        System.out.println("Localizado na posição: [" + linhaMaior + "][" + colunaMaior + "]");
        scanner.close();
    }
}


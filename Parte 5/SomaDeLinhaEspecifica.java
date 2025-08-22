import java.util.Scanner;

public class SomaDeLinhaEspecifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDigite o número da linha que deseja somar (0 a 4):");
        int linha = scanner.nextInt();

        if (linha >= 0 && linha < 5) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[linha][j];
            }
            System.out.println("A soma dos elementos da linha " + linha + " é: " + somaLinha);
        } else {
            System.out.println("Linha inválida!");
        }
        scanner.close();
    }
}


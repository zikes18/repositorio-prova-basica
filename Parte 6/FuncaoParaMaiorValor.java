import java.util.Scanner;

public class FuncaoParaMaiorValor {

    // Função para encontrar o maior valor em uma matriz de inteiros
    public static int encontrarMaiorValor(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("A matriz não pode ser nula ou vazia.");
        }
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz:");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = scanner.nextInt();

        int[][] minhaMatriz = new int[linhas][colunas];
        System.out.println("Preencha a matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                minhaMatriz[i][j] = scanner.nextInt();
            }
        }

        try {
            int maior = encontrarMaiorValor(minhaMatriz);
            System.out.println("O maior valor na matriz é: " + maior);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}


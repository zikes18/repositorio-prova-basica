import java.util.Scanner;

public class ContarValorNaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = {
            {1, 2, 3},
            {4, 2, 6},
            {7, 8, 2}
        };
        int contador = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDigite o número que deseja contar na matriz:");
        int numeroBusca = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numeroBusca) {
                    contador++;
                }
            }
        }
        System.out.println("O número " + numeroBusca + " aparece " + contador + " vezes na matriz.");
        scanner.close();
    }
}


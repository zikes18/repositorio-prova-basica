import java.util.Scanner;

public class BuscarValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Vetor pré-definido
        System.out.println("Digite um número para buscar no vetor:");
        int numeroBusca = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBusca) {
                System.out.println("O número " + numeroBusca + " foi encontrado na posição " + i + ".");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }
        scanner.close();
    }
}


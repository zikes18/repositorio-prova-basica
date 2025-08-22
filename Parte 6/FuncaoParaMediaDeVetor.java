import java.util.Scanner;

public class FuncaoParaMediaDeVetor {

    // Função para calcular a média de um vetor de doubles
    public static double calcularMedia(double[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return 0.0; // Retorna 0 se o vetor for nulo ou vazio
        }
        double soma = 0;
        for (double elemento : vetor) {
            soma += elemento;
        }
        return soma / vetor.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos elementos o vetor terá?");
        int tamanho = scanner.nextInt();

        double[] meuVetor = new double[tamanho];
        System.out.println("Digite os " + tamanho + " elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            meuVetor[i] = scanner.nextDouble();
        }

        double media = calcularMedia(meuVetor);
        System.out.println("A média dos elementos do vetor é: " + media);
        scanner.close();
    }
}


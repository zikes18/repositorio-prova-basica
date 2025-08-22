import java.util.Scanner;

public class PalindromoNoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();
        char[] vetor = palavra.toCharArray();
        boolean ehPalindromo = true;
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }
        scanner.close();
    }
}


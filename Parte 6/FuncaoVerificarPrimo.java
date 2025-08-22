import java.util.Scanner;

public class FuncaoVerificarPrimo {

    // Função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para verificar se é primo:");
        int num = scanner.nextInt();

        if (isPrimo(num)) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " NÃO é um número primo.");
        }
        scanner.close();
    }
}


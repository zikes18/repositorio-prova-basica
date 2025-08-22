import java.util.Scanner;

public class FuncaoDeFatorial {

    // Função para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número não negativo para calcular o fatorial:");
        int num = scanner.nextInt();

        try {
            long resultado = calcularFatorial(num);
            System.out.println("O fatorial de " + num + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}


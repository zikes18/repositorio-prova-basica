public class Fatorial {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;
        System.out.println("Digite um número para calcular o fatorial:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            System.out.println( i + ": " + fatorial);
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        sc.close();
    }
}

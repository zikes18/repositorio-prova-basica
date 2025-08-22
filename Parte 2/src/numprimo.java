public class numprimo {
    public static void main(String[] args) {
        int numero;
        boolean isPrimo = true;
        System.out.println("Digite um número para verificar se é primo:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        if (numero <= 1) {
            isPrimo = false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
        sc.close();
    }
}

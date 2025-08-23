public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, numero;
        System.out.println("Digite a quantidade de termos da sequência de Fibonacci:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        System.out.print(n1 + " " + n2); // Imprime os dois primeiros termos
        for (int i = 2; i < numero; i++) { // Começa de 2 porque os dois primeiros termos já foram impressos
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }

}


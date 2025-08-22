public class tabuada {
    public static void main(String[] args) {
        int numero;
        System.out.println("Tabuada de multiplicação de 1 a 10 para o numero digitado:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }

}

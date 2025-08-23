public class Contagemimppar {
    public static void main(String[] args) {
        int numero,pares=0,impares=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Indique 10 números inteiros e mostrarei quantos são pares e quantos ímpares:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número:");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        sc.close();
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        
    }
}

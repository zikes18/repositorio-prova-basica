public class maiormenor {
    public static void main(String[] args) {
        int numero, maior, menor;
        System.out.println("Digite números para encontrar o maior e o menor (digite 0 para finalizar):");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        maior = numero;
        menor = numero;

        while (numero != 0) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            numero = sc.nextInt();
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}

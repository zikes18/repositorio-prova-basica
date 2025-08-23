public class Adivinhenumero {
    public static void main(String[] args) {

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int tentativa;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Tente adivinhar o número entre 1 e 100:");
        do {
            tentativa = sc.nextInt();
            if (tentativa < numeroSecreto) {
                System.out.println("Maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Menor!");
            }
        } while (tentativa != numeroSecreto);
        System.out.println("Parabéns! Você acertou o número " + numeroSecreto);
        sc.close();
    }

}

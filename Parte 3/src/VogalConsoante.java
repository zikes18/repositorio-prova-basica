import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letra = sc.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("A letra " + letra + " é uma consoante.");
        } else {
            System.out.println("Caractere inválido. Por favor, digite uma letra.");
        }
    }
}

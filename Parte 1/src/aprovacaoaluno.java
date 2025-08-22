
import java.util.Scanner;

public class aprovacaoaluno {
    public static void main(String[] args) throws Exception {
        double nota1, nota2, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >= 7.0) {
            System.out.printf("A média é: %.2f. Aluno aprovado!\n", media);
        } else {
            System.out.printf("A média é: %.2f. Aluno reprovado!\n", media);
        }
        sc.close();
    }

}

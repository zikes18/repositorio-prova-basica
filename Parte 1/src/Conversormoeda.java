import java.util.Scanner;

public class Conversormoeda {

    public static void main(String[] args) throws Exception {
        double valorDolar, valorReal, cotacao=5.41;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Reais(R$): ");
        valorReal = sc.nextDouble();
       
        valorDolar = valorReal / cotacao;
        System.out.printf("O valor em Dólares(US$) é: %.2f\n", valorDolar);
        sc.close();
    }
}

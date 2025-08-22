import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (em kg): ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        altura = sc.nextDouble();
        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }
        sc.close();
    }

}

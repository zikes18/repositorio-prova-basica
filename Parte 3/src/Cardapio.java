import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Menu da Lanchonete ---");
            System.out.println("1. Pão de queijo");
            System.out.println("2. Pão");
            System.out.println("3. Salgado");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Pão de queijo.");
                    break;
                case 2:
                    System.out.println("Você escolheu Pão.");
                    break;
                case 3:
                    System.out.println("Você escolheu Salgado.");
                    break;
                case 4:
                    System.out.println("Saindo do cardápio. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);
    }
}

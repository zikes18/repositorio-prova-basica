import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Menu da Lanchonete ---");
            System.out.println("1. Hambúrguer");
            System.out.println("2. Pizza");
            System.out.println("3. Refrigerante");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Hambúrguer.");
                    break;
                case 2:
                    System.out.println("Você escolheu Pizza.");
                    break;
                case 3:
                    System.out.println("Você escolheu Refrigerante.");
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

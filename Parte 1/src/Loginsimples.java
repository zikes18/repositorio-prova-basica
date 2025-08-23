import java.util.Scanner;

public class Loginsimples {
    public static void main(String[] args) throws Exception {
        String usuario, senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        usuario = sc.nextLine();
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
        sc.close();
    }
}

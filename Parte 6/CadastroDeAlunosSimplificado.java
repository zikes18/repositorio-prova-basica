import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeAlunosSimplificado {

    private static List<String> nomes = new ArrayList<>();
    private static List<Double> notas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu de Cadastro de Alunos ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Exibir Média da Turma");
            System.out.println("4. Exibir Aluno com Maior Nota");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    exibirMediaTurma();
                    break;
                case 4:
                    exibirAlunoMaiorNota();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }

    public static void cadastrarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        nomes.add(nome);
        notas.add(nota);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void listarAlunos() {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Alunos ---");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
        }
    }

    public static void exibirMediaTurma() {
        if (notas.isEmpty()) {
            System.out.println("Nenhum aluno para calcular a média.");
            return;
        }
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / notas.size();
        System.out.printf("Média da turma: %.2f%n", media);
    }

    public static void exibirAlunoMaiorNota() {
        if (notas.isEmpty()) {
            System.out.println("Nenhum aluno para verificar a maior nota.");
            return;
        }
        double maiorNota = -1.0;
        String nomeMaiorNota = "";

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > maiorNota) {
                maiorNota = notas.get(i);
                nomeMaiorNota = nomes.get(i);
            }
        }
        System.out.println("Aluno com a maior nota: " + nomeMaiorNota + " (Nota: " + maiorNota + ")");
    }
}


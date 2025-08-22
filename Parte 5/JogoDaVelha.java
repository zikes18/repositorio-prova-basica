import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarTabuleiro();
        boolean jogoTerminou = false;

        while (!jogoTerminou) {
            imprimirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", digite sua jogada (linha coluna, ex: 0 0):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (jogar(linha, coluna)) {
                if (verificarVitoria()) {
                    imprimirTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoTerminou = true;
                } else if (verificarEmpate()) {
                    imprimirTabuleiro();
                    System.out.println("O jogo terminou em empate!");
                    jogoTerminou = true;
                } else {
                    trocarJogador();
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void imprimirTabuleiro() {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean jogar(int linha, int coluna) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = jogadorAtual;
            return true;
        }
        return false;
    }

    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    private static boolean verificarVitoria() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false; // Ainda há espaços vazios
                }
            }
        }
        return true; // Tabuleiro cheio, é um empate
    }
}


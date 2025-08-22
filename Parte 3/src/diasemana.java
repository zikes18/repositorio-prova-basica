public class diasemana {
    public static void main(String[] args) {
        int dia;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para o dia da semana:");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um número de 1 a 7.");
                break;
        }
        sc.close();
    }
}

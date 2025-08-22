import java.util.Scanner;

public class LerImprimirvetor {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Os números digitados foram:");
        
            for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        
        sc.close();
    }
}

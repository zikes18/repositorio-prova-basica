import java.util.Scanner;

public class Somasimples{
    public static void main(String[] args) throws Exception {
       int n1,n2,somar;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
         n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
         n2 = sc.nextInt();
        somar = n1 + n2;
        System.out.println("A soma dos numeros é: " + somar);
        sc.close();

        
    }
}

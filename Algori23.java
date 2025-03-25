import java.util.Scanner;

public class Algori23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,d;

        System.out.println("\nDigite um numero de tres casas: ");
        a = sc.nextInt();

        d = a % 100 / 10;

        System.out.println("\nAlgarismo da casa das dezenas é: "+d);
        System.out.println("\n");
        
        sc.close();
    }
}
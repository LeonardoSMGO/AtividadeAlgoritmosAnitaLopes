import java.util.Scanner;

public class Algori54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b;

        System.out.println("\nEntre com base de um triângulo: ");
        a = sc.nextDouble();

        System.out.println("\nEntre com a altura de um triângulo: ");
        b = sc.nextDouble();

        System.out.println("\nArea = "+((a*b)/2));
        System.out.println("\n");

        sc.close();
    }
}
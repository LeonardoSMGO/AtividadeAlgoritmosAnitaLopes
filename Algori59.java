import java.util.Scanner;

public class Algori59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c;

        System.out.println("\nEntrar com 1 cateto: ");
        b = sc.nextDouble();

        System.out.println("\nEntrar com 2 cateto: ");
        c = sc.nextDouble();

        a =  Math.sqrt((b*b) + (c*c));

        System.out.println("\nA hipotenusa é: "+a);
        sc.close();
    }
}
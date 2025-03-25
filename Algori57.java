import java.util.Scanner;

public class Algori57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pr1,pr2,mf;

        System.out.println("\nDigite pr1: ");
        pr1 = sc.nextDouble();

        System.out.println("Digite pr2: ");
        pr2 = sc.nextDouble();

        mf = (pr1 + pr2) / 2;

        System.out.println("\nMédia truncada = " + (int) mf);
        System.out.println("Média arredondada = " + Math.round(mf));

        sc.close();
    }
}
import java.util.Scanner;

public class Algori55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diagMaior, diagMenor, area;

        System.out.println("\nMedida da diagonal maior: ");
        diagMaior = sc.nextDouble();

        System.out.println("\nMedida da diagonal menor: ");
        diagMenor = sc.nextDouble();

        area = (diagMaior * diagMenor) / 2;

        System.out.println("\nArea = "+area);
        System.out.println("\n");

        sc.close();
    }
}
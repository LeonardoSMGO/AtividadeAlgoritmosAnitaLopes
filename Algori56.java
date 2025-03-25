import java.util.Scanner;

public class Algori56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("\nDigite o nome: ");
        nome = sc.nextLine();

        System.out.println("\nDigite a idade: ");
        idade = sc.nextInt();

        System.out.println("\n\n");

        System.out.println("\nNome = "+nome);
        System.out.println("\nIdade = "+idade);
        System.out.println("\n");

        sc.close();
    }
}
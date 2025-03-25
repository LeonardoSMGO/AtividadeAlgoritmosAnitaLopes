import java.util.Scanner;

public class Algori161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        double num;
            for(c = 1; c <= 5; c++){
                System.out.println("\nNumero: ");
                num = sc.nextDouble();
                System.out.println("Quadrado: "+(num*num));
            }
            System.out.println("\n");
                
            sc.close();    
        }
        
    }
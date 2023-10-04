import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a= ");
        double a = scanner.nextDouble();
        System.out.println("Enter b= ");
        double b = scanner.nextDouble();
        System.out.println("Enter c = ");
        double c = scanner.nextDouble();

        double S = (2 * a *b + 2 * b *c + 2 * a *c ) / 3;
        System.out.println("Suprafata este: " + S );




    }
}
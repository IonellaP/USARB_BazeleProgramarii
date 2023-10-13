package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex2_TipulTriunghiului {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul real a: ");
        double a = scanner.nextDouble();
        System.out.println("Introduceti numarul real b: ");
        double b = scanner.nextDouble();
        System.out.println("Introduceti numarul real c: ");
        double c = scanner.nextDouble();
        scanner.close();

        if (a + b > c && a + c > b && c + b > a) {
            if (a == b && b == c) {
                System.out.println("Triunghiul este echilateral");
            } else if (a == b || a == c || c == b) {
                System.out.println("Triunghiul este isoscel");
            } else if ((a * a + b *b == c * c) || (b * b + c * c == a * a) ) {
                System.out.println("Triunghiul este dreptunghic");
            } else {
                System.out.println("Triunghiul este unu oarecare");
            }
        }
    }
}

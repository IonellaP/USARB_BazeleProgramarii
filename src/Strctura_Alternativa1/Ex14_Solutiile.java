package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex14_Solutiile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți coeficientul A:");
        double A = scanner.nextDouble();

        System.out.println("Introduceți coeficientul B:");
        double B = scanner.nextDouble();

        System.out.println("Introduceți coeficientul C:");
        double C = scanner.nextDouble();

        double discriminant = B * B - 4 * A * C;

        if (discriminant > 0) {
            double x1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println("Ecuația are două soluții reale distincte:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -B / (2 * A);
            System.out.println("Ecuația are o soluție reală dublă:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Ecuația nu are soluții reale.");
        }
    }
}

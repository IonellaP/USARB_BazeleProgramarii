package Proceduri1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți raza: ");
        double r = scanner.nextDouble();

        calculeazaAriaPerimetrulCircumferintei(r);

        scanner.close();
    }

    public static void calculeazaAriaPerimetrulCircumferintei(double r) {
        double aria = Math.PI * r * r;
        double perimetru = 2 * Math.PI * r;

        System.out.println("Aria circumferinței este: " + aria);
        System.out.println("Perimetrul circumferinței este: " + perimetru);
    }
}

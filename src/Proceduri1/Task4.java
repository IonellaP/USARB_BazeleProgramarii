package Proceduri1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți lungimea laturii p: ");
        double p = scanner.nextDouble();

        System.out.print("Introduceți lungimea laturii q: ");
        double q = scanner.nextDouble();

        double aria = calculeazaAria(p, q);
        double perimetru = calculeazaPerimetru(p, q);

        afiseazaRezultatele(aria, perimetru);

        scanner.close();
    }

    public static double calculeazaAria(double p, double q) {
        return p * q;
    }

    public static double calculeazaPerimetru(double p, double q) {
        return 2 * (p + q);
    }

    public static void afiseazaRezultatele(double aria, double perimetru) {
        System.out.println("Aria dreptunghiului este: " + aria);
        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
    }
}

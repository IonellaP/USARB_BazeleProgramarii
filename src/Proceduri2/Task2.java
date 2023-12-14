package Proceduri2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti numarul b: ");
        int b = scanner.nextInt();
        System.out.println("Introduceti numarul c: ");
        int c = scanner.nextInt();

        int cmmmcFinal = cmmmcTreiNumere(a, b, c);
        System.out.println("CMMMC al celor trei numere este: " + cmmmcFinal);
    }

    public static int cmmcdDouaNumere(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return cmmcdDouaNumere(y, x % y);
        }
    }

    public static int cmmmcDouaNumere(int a, int b) {
        return (a * b) / cmmcdDouaNumere(a, b);
    }

    public static int cmmmcTreiNumere(int a, int b, int c) {
        int cmmmcAB = cmmmcDouaNumere(a, b);
        int cmmmcFinal = cmmmcDouaNumere(cmmmcAB, c);
        return cmmmcFinal;
    }
}

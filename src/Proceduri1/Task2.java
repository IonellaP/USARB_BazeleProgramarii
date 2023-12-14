package Proceduri1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti numarul b: ");
        int b = scanner.nextInt();
        MinAndMax(a, b);
    }

    public static void MinAndMax(int a, int b) {
        if ( a > b) {
            System.out.println("Cel mai mare numar: " + a);
            System.out.println("Cel mai mic numar: " + b);
        } else {
            System.out.println("Cel mai mare numar: " + b);
            System.out.println("Cel mai mic numar: " + a);
        }
    }
}

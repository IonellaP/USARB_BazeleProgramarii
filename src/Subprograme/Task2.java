package Subprograme;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primul numar real: ");
        double num1 = scanner.nextDouble();
        System.out.println("Al doilea numar real");
        double num2 = scanner.nextDouble();

        AfisareaMinimMaxim(num1, num2);
    }

    static void AfisareaMinimMaxim(double num1, double num2) {
        double min, max;

        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        System.out.println("Numarul minim este: " + min + " iar  numarul maxim este: " + max);
    }
}

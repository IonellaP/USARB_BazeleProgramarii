package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex12_MaximSiMinim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 4 numere");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int min = num1;
        int max = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num2 > max) {
            max = num2;
        }

        if (num3 < min) {
            min = num3;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num4 < min) {
            min = num4;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("Numarul minim este: " + min);
        System.out.println("Numarul maxim este: " + max);
    }
}

package Structura_Repetitiva2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int num = scanner.nextInt();
        int lastDigit = 0;
        int digit = 0;

        do {
             lastDigit = num % 10;
            digit = num / 100;
        } while (num == 0);
        System.out.println("Numarul de ordinul inferior este: " + lastDigit + " iar cel de ordin superior este: " + digit);

    }
}

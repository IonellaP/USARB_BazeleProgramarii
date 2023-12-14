package Structura_Repetitiva2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = scanner.nextInt();

        while (n != 0) {
            int digit = n % 10;
            if (digit == 5) {
                System.out.println("Numarul contine cifra 5");
            }

            n /= 10;
        }
    }
}

package Structura_Repetitiva2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int digit = i;
            int sumDigit = 0;

            while (digit != 0 ){
                sumDigit += digit % 10;
                digit /= 10;
            }
            if (sumDigit != 0 && i % sumDigit == 0) {
                System.out.println(i);
            }
        }

    }
}

package Structura_Repetitiva2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();

        int count = 0;
        while (numar != 0) {
            numar /= 10;
            count++;
        }
        System.out.println("Numarul de cifre este: " + count);
    }
}

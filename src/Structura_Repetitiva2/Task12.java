package Structura_Repetitiva2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            int sumaCifrelor = 0;
            int copie = num;

            while (copie > 0) {
                sumaCifrelor += copie % 10;
                copie /= 10;
            }

            if (sumaCifrelor == num) {
                System.out.println("Perechea de numere cu suma cifrelor egala cu numarul: " + num + " " + sumaCifrelor);
            }
        }
    }
}

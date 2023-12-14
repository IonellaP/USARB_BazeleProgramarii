package Structura_Repetitiva1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 10 numere: ");

        int pozitive = 0;
        int negative = 0;
        int sumP = 0;
        int sumN = 0;
        int media = 0;

        for (int i = 1; i <= 10; i++) {
            int num = scanner.nextInt();

            if (num >= 0) {
                pozitive++;
                sumP += num;
            } else {
                negative++;
                sumN += num;
                media = sumN / negative;
            }
        }

        System.out.println("Numarul de cifre pozitive: " + pozitive);
        System.out.println("Suma cifrelor pozitive: " + sumP);
        System.out.println("Media aritmetica a cifrelor negative: " + media);

        scanner.close();
    }
}

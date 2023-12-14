package Structura_Repetitiva2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int identice = 0;
        System.out.println("Introduceti numerele(0 pentru a incheia): ");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }

            if (num >=10 && num <= 99 && num % 11 == 0) {
                identice++;
            }
        }
        System.out.println("Numere formate din 2 cifre identice sunt: " + identice);
    }
}

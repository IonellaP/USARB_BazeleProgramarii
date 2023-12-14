package Structura_Repetitiva2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul dumneavoastra: ");
        int num = scanner.nextInt();

        int contor = 0;
        while (num > 0) {
            int lastNum = num % 10;
            if (lastNum == 7) {
                contor++;
            }

            num /= 10;
        }

        System.out.println("Cifra 7 se intalneste de " + contor + " ori" );
    }
}

package Structura_Repetitiva2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int num = scanner.nextInt();
        int pare = 0;
        int impare = 0;

        while (num != 0){
            int last = num % 10;

            if (last % 2 == 0) {
                pare++;
            } else {
                impare++;
            }

            num /= 10;
        }
        System.out.println("Numarul de cifre pare " + pare + " numarul de cifre impare " + impare);

    }
}

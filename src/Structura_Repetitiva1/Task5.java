package Structura_Repetitiva1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul n  de numere:  ");
        int n = scanner.nextInt();

        int maxim = Integer.MIN_VALUE;
        int minim = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int numar = scanner.nextInt();

            if (numar < minim ){
                minim = numar;
            } else if (numar > maxim) {
                maxim = numar;
            }
        }


        System.out.println("Numarul maxim este: " + maxim);
        System.out.println("Numarul minim este: " + minim);

    }
}

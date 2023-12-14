package Structura_Repetitiva1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar nenul: ");
        int numar = scanner.nextInt();
        if (numar > 0) {
            int divizori = 1;

            for (int i = 2; i <= numar / 2; i++) {
                if (numar % i == 0) {
                    divizori += i;
                }
            }

            if (divizori == numar) {
                System.out.println("Numarul este perfect");
            } else {
                System.out.println("Numarul nu este perfect");
            }
        }

        scanner.close();
    }
}

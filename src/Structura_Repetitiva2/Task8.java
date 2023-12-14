package Structura_Repetitiva2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");
        int numarSchimbareSemn = 0;
        int prevNumber = scanner.nextInt();

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if ((number >= 0 && prevNumber < 0) || (number < 0 && prevNumber >= 0)) {
                numarSchimbareSemn++;
            }
            prevNumber = number;
        }

        System.out.println("Numărul de schimbări de semn este: " + numarSchimbareSemn);
    }
}


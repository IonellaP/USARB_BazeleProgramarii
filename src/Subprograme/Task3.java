package Subprograme;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int num = scanner.nextInt();

        ImagineInversa(num);
    }

    static void ImagineInversa (int num) {
        int inversul = 0;

        while (num != 0) {
            int cifra = num % 10;
            inversul = inversul * 10 + cifra;
            num = num / 10;
        }
        System.out.println(inversul);
    }
}

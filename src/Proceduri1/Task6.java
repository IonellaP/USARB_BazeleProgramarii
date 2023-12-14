package Proceduri1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul:  ");
        int num = scanner.nextInt();
        System.out.println("Inversul numarului " + num + " este ");
        ImagineInversa(num);
    }

    public static void ImagineInversa(int num) {
        int inversare = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            inversare = inversare *  10 + lastDigit;
            num /= 10;
        }
        System.out.println(inversare);
    }
}

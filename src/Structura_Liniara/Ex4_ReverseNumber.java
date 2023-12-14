package Structura_Liniara;

import java.util.Scanner;

public class Ex4_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int reverse = (n % 10) * 1000 + ((5731 / 100) % 10) * 100 + (5731 % 100) / 10 *10 + 5731 / 1000;
        System.out.println(reverse);
    }
}

package Structura_Repetitiva1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int semn = 1;

        for (int i = 1; i <= n; i++) {
            suma += semn * i;
            semn = -semn;
        }

        System.out.println(suma);

        scanner.close();
    }
}

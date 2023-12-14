package Structura_Repetitiva1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        double suma = 0;
        double produs = 1;

        for (int i = 1; i <= num; i++) {
            produs = i * produs;
            suma = produs + suma;
        }

        System.out.println("Suma este: " + suma);

    }
}

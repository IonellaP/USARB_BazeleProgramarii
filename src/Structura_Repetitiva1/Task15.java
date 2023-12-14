package Structura_Repetitiva1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n / 2; i++){
            int primulNumar = i;
            int numDoi = i + 1;

            if (primulNumar + numDoi == n) {
                System.out.println(n  + " = " + primulNumar + " + " + numDoi);
            }  else {
                System.out.println("Descompunerea nu este posibila");
            }
        }

        scanner.close();
    }
}

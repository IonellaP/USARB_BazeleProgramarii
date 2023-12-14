package Structura_Repetitiva1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n =  ");
        int n = scanner.nextInt();
        System.out.print("k =  ");
        int k = scanner.nextInt();

        System.out.println("Introduceti cele " + n + "numere naturale");
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            int divizori = 0;

            for (int j =1; j <= num; j++) {
                if (num % j == 0 ){
                    divizori++;
                }
            }
            if (divizori == k ){
                System.out.println(num);
            }
        }

        scanner.close();
    }
}

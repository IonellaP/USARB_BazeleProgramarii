package Structura_Repetitiva1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intrduceti numarul n: ");
        int n = scanner.nextInt();
        int S = 0;

        for (int i = 2; i <= n; i+=2) {
            S +=i;
            System.out.println(S);
        }
    }
}

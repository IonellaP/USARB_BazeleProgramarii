package Structura_Repetitiva1;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți valoarea a: ");
        int a = scanner.nextInt();

        System.out.print("Introduceți numărul de elemente n: ");
        int n = scanner.nextInt();

        int aparitii = 0;

        System.out.println("Introduceți cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == a) {
                aparitii++;
            }
        }

        System.out.println("Valoarea " + a + " apare de " + aparitii + " ori.");

        scanner.close();
    }
}

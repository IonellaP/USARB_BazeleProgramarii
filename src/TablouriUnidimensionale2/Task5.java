package TablouriUnidimensionale2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul întreg k: ");
        int k = scanner.nextInt();

        System.out.print("Introduceți numărul de elemente din vector: ");
        int n = scanner.nextInt();

        int[] A = new int[n];

        System.out.println("Introduceți elementele vectorului:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        int pozitie = gasesteMaiMare(A, k);

        if (pozitie != -1) {
            System.out.println("Primul element din tabloul mai mare decât k se află la poziția: " + pozitie);
        } else {
            System.out.println("Nu există niciun element în tabloul mai mare decât k.");
        }

        scanner.close();
    }

    public static int gasesteMaiMare(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > k) {
                return i + 1;
            }
        }
        return -1;
    }
}

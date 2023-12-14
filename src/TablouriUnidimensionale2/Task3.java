package TablouriUnidimensionale2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul de elemente din vector: ");
        int n = scanner.nextInt();

        int[] A = new int[n];

        System.out.println("Introduceți elementele vectorului:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        boolean esteCrescator = verificaCrescator(A);

        if (esteCrescator) {
            System.out.println("Elementele vectorului sunt ordonate strict crescător.");
        } else {
            System.out.println("Elementele vectorului NU sunt ordonate strict crescător.");
        }

        scanner.close();
    }

    public static boolean verificaCrescator(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

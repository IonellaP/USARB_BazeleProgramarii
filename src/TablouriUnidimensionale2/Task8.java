package TablouriUnidimensionale2;

import java.util.Scanner;

public class Task8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceți numărul de elemente din vector: ");
            int n = scanner.nextInt();

            int[] A = new int[n];

            System.out.println("Introduceți elementele vectorului:");

            boolean contineCifreEgale = false;

            for (int i = 0; i < n; i++) {
                System.out.print("Elementul " + (i + 1) + ": ");
                A[i] = scanner.nextInt();

                int primaCifra = Math.abs(A[i]) % 10;
                int ultimaCifra = 0;
                int temp = A[i];

                while (temp != 0) {
                    ultimaCifra = temp % 10;
                    temp /= 10;
                }

                if (primaCifra == ultimaCifra) {
                    contineCifreEgale = true;
                }
            }

            if (contineCifreEgale) {
                System.out.println("Vectorul conține elemente cu prima și ultima cifră egală.");
            } else {
                System.out.println("Vectorul NU conține elemente cu prima și ultima cifră egală.");
            }

            scanner.close();
        }
    }


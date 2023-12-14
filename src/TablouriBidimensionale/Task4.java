package TablouriBidimensionale;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de linii (n): ");
        int n = scanner.nextInt();
        System.out.print("Introduceti numarul de coloane (m): ");
        int m = scanner.nextInt();

        int[][] matrice = new int[n][m];

        System.out.println("Introduceti elementele matricei:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementele minime pe fiecare linie sunt:");
        for (int i = 0; i < n; i++) {
            int minimLinie = matrice[i][0];

            for (int j = 1; j < m; j++) {
                if (matrice[i][j] < minimLinie) {
                    minimLinie = matrice[i][j];
                }
            }

            System.out.println("Linia " + (i + 1) + ": " + minimLinie);
        }

        System.out.println("Elementele maxime pe fiecare coloana sunt:");
        for (int j = 0; j < m; j++) {
            int maximColoana = matrice[0][j];

            for (int i = 1; i < n; i++) {
                if (matrice[i][j] > maximColoana) {
                    maximColoana = matrice[i][j];
                }
            }

            System.out.println("Coloana " + (j + 1) + ": " + maximColoana);
        }
    }
}

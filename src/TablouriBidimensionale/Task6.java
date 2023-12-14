package TablouriBidimensionale;

import java.util.Scanner;

public class Task6 {
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

        int indexRindZero = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] == 0) {
                    indexRindZero = i;
                    break;
                }
            }
            if (indexRindZero != -1) {
                break;
            }
        }

        if (indexRindZero != -1) {
            int[] temp = matrice[0];
            matrice[0] = matrice[indexRindZero];
            matrice[indexRindZero] = temp;

            System.out.println("Matricea dupa schimbare:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nu s-a gasit elementul 0 in matrice.");
        }
    }
}

package TablouriBidimensionale;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti dimensiunea matricei pătrate: ");
        int n = scanner.nextInt();

        int[][] matriceA = new int[n][n];
        int[][] matriceB = new int[n][n];

        System.out.println("Introduceti elementele matricei A:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriceA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriceB[i][j] = (matriceA[i][j] + matriceA[j][i]) / 2;
            }
        }

        System.out.println("Matricea B (simetrica) este:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriceB[i][j] + " ");
            }
            System.out.println();
        }
    }
}

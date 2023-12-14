package TabloruriUnidimensionale1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul k: ");
        int k = scanner.nextInt();

        System.out.print("Introdu numarul de elemente n: ");
        int n = scanner.nextInt();
        int[] A = new int[n];


        System.out.println("Introdu elementele vectorului:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int pozitie = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] < k) {
                pozitie = i;
                break;
            }
        }
        if (pozitie != -1) {
            System.out.println("Pozitia ultimului element mai mic decat k este: " + pozitie);
        } else {
            System.out.println("Nu exista elemente mai mici decat k in vector.");
        }
    }
}

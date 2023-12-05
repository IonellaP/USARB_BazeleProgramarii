package TabloruriUnidimensionale;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul de elemente: ");
        int elemente = scanner.nextInt();

        int[] A = new int[elemente];
        System.out.println("Introdu elementele vectorului: ");
        for (int i = 0; i < elemente; i++) {
            A[i] = scanner.nextInt();
        }
        int pozitia = Verificare(A);

        if (pozitia != -1){
            System.out.println("Contine cel putin o pereche de valori egale la pozitia " + pozitia);
        } else {
            System.out.println("Vectorul nu contine perechi de elemente egale");
        }

    }

    public static int Verificare(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
}

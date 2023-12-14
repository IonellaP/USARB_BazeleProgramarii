package Structura_Repetitiva2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numere formate din 2 cifre: ");
        int numbers;
        int count = 0;

        do {
            numbers = scanner.nextInt();

            if (numbers > 1){
                boolean numarPrim = true;
                for (int i = 2; i < numbers; i++) {
                    if (numbers % i == 0){
                        numarPrim = false;
                        break;
                    }

                }
                if (numarPrim) {
                    count++;
                }
            }
        } while (numbers != 0);
        System.out.println("Numere prime sunt: " + count);

        scanner.close();
    }
}

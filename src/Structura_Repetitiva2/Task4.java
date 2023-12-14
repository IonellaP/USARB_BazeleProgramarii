package Structura_Repetitiva2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduceti numere nenule: ");
        int count = 0;

        while (true){
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num >= 100 && num <= 999){
                count++;
            }
        }

        System.out.println("Numarul de numere formate de 3 cifre este: " + count);
    }
}

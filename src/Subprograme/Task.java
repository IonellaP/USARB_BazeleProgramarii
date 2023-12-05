package Subprograme;

import java.util.Scanner;

public class Task
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul natural: ");
        int num = scanner.nextInt();

        Calcul(num);

    }
    static void Calcul(int num) {
        int suma = 0;
        int produs = 1;

        while (num > 0) {
            int cifra = num % 10;
            suma= suma + cifra;
            produs = produs * cifra;
            num = num / 10;
        }
        System.out.println("suma cifrelor: " + suma);
        System.out.println("produsul cifrelor: " + produs);
    }
}

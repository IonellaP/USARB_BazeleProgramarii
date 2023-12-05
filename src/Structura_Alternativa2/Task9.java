package Structura_Alternativa2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea elementului circumferintei: ");
        int elem = scanner.nextInt();

        System.out.println("Introduceti numarul elementului circumferintei: ");
        int num = scanner.nextInt();

        int raza = 0;
        int diametru = 0;
        int lungime = 0;
        int aria = 0;

        switch (num) {
            case 1:
                raza = elem;
                diametru = 2 * raza;
                lungime = (int) (Math.PI * raza);
                aria = (int) Math.PI * raza * raza;
                break;
            case 2:
                diametru = elem;
                raza = diametru / 2;
                lungime = (int) Math.PI * diametru;
                aria = (int) Math.PI * raza * raza;
                break;
            case 3:
                lungime = elem;
                raza = (int) (lungime / (2 * Math.PI));
                diametru = 2 * raza;
                aria = (int) (Math.PI * raza * raza);
                break;
            case 4:
                aria = elem;
                raza = (int) Math.sqrt(aria / Math.PI);
                diametru = 2 * raza;
                lungime = (int) (2 * Math.PI * raza);
                break;
            default:
                System.out.println("Numărul elementului introdus nu este valid.");
        }

        System.out.println("Raza: " + raza);
        System.out.println("Diametrul: " + diametru);
        System.out.println("Lungimea: " + lungime);
        System.out.println("Aria: " + aria);
    }
}

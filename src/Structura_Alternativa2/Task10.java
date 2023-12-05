package Structura_Alternativa2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nota de purtare a elevului: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Purtarea este nesatisfacatoare");
                break;
            case 5:
            case 6:
                System.out.println("Purtarea este satisfacatoare");
                break;
            case 7:
            case 8:
                System.out.println("Purtarea este buna");
                break;
            case 9:
            case 10:
                System.out.println("Purtarea este exemplara");
                break;
            default:
                System.out.println("Nu ati introdus date corecte");
        }

    }
}

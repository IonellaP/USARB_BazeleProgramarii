package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex15_PredecesorSuccesor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        int number1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int number2 = scanner.nextInt();

        if (number1 + 1 == number2) {
            System.out.println("Numarul 1 este predecesorul numarului 2 ");
        } else {
            System.out.println("Numarul 1 nu este predecesorul numarului 2");
        }
    }
}

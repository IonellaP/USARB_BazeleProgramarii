package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex11_OrdineaCreascatoare {
    public static void main(String[] args) {
        System.out.println("Introduceti numele si inaltimea celor 3 copii");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele primului copil: ");
        String nume1 = scanner.next();
        System.out.println("Inaltimea primului copil: ");
        int h1 = scanner.nextInt();
        System.out.println("Numele celui de al doilea copil: ");
        String nume2 = scanner.next();
        System.out.println("Inaltimea celui de al doilea copil: ");
        int h2 = scanner.nextInt();
        System.out.println("Numele celui de al treilea copil: ");
        String nume3 = scanner.next();
        System.out.println("Inaltimea celui de al treilea copil: ");
        int h3 = scanner.nextInt();

        if (h1 <= h2 && h1 <= h3) {
            System.out.println(nume1);
            if (h2 <= h3) {
                System.out.println(nume2);
                System.out.println(nume3);
            } else {
                System.out.println(nume3);
                System.out.println(nume2);
            }
        } else if (h2 <= h1 && h2 <= h3) {
            System.out.println(nume2);
            if (h1 <= h3) {
                System.out.println(nume1);
                System.out.println(nume3);
            } else {
                System.out.println(nume3);
                System.out.println(nume1);
            }
        } else {
            System.out.println(nume3);
            if (h1 <= h2) {
                System.out.println(nume1);
                System.out.println(nume2);
            } else {
                System.out.println(nume2);
                System.out.println(nume1);
            }
        }

    }
}

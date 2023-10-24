package Structura_Alternativa2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti caracterul: ");
        char litera = scanner.next().charAt(0);

        switch (litera) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
                System.out.println("Caracterul este o vocala");
                break;
            case 'q':
            case 'w':
            case 'r':
            case 't':
            case 'p':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'b':
            case 'v':
            case 'c':
            case 'x':
            case 'z':
                System.out.println("Caracterul introdus este o consoana ");
                break;
        }
        scanner.close();
    }
}

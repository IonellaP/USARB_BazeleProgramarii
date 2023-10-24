package Structura_Alternativa2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti data de la 1 pana la 31");
        int data = scanner.nextInt();
        int decada;

        switch ((data - 1) / 10) {
            case 0:
                decada = 1;
                break;
            case 1:
                decada = 2;
                break;
            case 2:
                decada = 3;
                break;
            default:
                decada = 4;
                break;
        }
        System.out.println("Ziua " + data + " se afla in decada " + decada);
        scanner.close();
    }
}

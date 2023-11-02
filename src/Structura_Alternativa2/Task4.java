package Structura_Alternativa2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul lunii: ");
        int luna = scanner.nextInt();

        String anotimp;
        switch (luna) {
            case 12:
            case 1:
            case 2:
                anotimp = "Iarna";
                break;

            case 3:
            case 4:
            case 5:
                anotimp = "Primavara";
                break;
            case 6:
            case 7:
            case 8:
                anotimp = "Vara";
                break;
            case 9:
            case 10:
            case 11:
                anotimp = "Toamna";
                break;
            default:
                anotimp = "Luna introdusa nu este valida";
                break;

        }
        System.out.println("Este anotimpul: " + anotimp);
    }
}

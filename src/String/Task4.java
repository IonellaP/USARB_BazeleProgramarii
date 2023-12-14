package String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul: ");
        String text = scanner.nextLine().toLowerCase();
        int numarVocale = 0;
        int numarConsoane = 0;
        String vocale = "";
        String consoane = "";

        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vocale += caracter;
                    numarVocale++;
                } else {
                    consoane += caracter;
                    numarConsoane++;
                }
            }
        }

        System.out.println("a) Vocales: " + vocale + " " + numarVocale);
        System.out.println("b) Consoane: " + consoane + " " + numarConsoane);

    }
}

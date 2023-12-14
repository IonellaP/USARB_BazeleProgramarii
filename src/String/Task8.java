package String;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul (terminati cu '.'): ");
        String text = scanner.nextLine();

        String[] cuvinte = text.split(" ");
        String cuvantMaxim = "";

        for (String cuvant : cuvinte) {
            if (cuvant.endsWith(".")) {
                cuvant = cuvant.substring(0, cuvant.length() - 1);
            }
            if (cuvant.length() > cuvantMaxim.length()) {
                cuvantMaxim = cuvant;
            }
        }

        System.out.println("Cuvantul cu lungimea maxima este: " + cuvantMaxim);
    }
}

package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex13_Seminte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul de pungulițe cu semințe: ");
        int numarPungulite = scanner.nextInt();

        int gramePePungulita = 20;

        System.out.print("Introduceți numărul de metri pătrați ai grădinii (m): ");
        int numarMetri = scanner.nextInt();

        System.out.print("Câte grame de semințe sunt necesare pentru fiecare metru pătrat (S): ");
        int gramePerMetruPatrat = scanner.nextInt();

        int grameNecesare = numarMetri * gramePerMetruPatrat;
        int grameDisponibile = numarPungulite * gramePePungulita;

        if (grameDisponibile >= grameNecesare) {
            System.out.println("Da, Alina are suficiente semințe pentru a acoperi întreaga grădină.");
        } else {
            System.out.println("Nu, Alina nu are suficiente semințe pentru a acoperi întreaga grădină.");
        }
    }
}

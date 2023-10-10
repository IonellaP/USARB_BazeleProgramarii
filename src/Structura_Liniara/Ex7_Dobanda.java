package Structura_Liniara;

import java.util.Scanner;

public class Ex7_Dobanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti suma S: ");
        short S = scanner.nextShort();

        System.out.println("Introduceti rata dobanzii anuale: ");
        short P = scanner.nextShort();

        double  rataTrimestriala = (double) P / 4 / 100;

        double dobandaTrimestriala = S * rataTrimestriala;

        System.out.println("Dobanda obtinuta dupa 3 luni este: " + dobandaTrimestriala);
        scanner.close();

    }
}

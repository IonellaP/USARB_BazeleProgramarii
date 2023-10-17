package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex9_NumarulX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul format din 3 cifre");
        int numar = scanner.nextInt();


        if (numar >= 100 && numar <= 999) {
            int primaCifra = numar / 100;
            int aDouaCifra = (numar / 10) % 10;
            int aTreiaCifra = numar % 10;

            int sumaCifrelor = primaCifra + aDouaCifra + aTreiaCifra;
            int produsulCifrelor = primaCifra * aDouaCifra * aTreiaCifra;

            if (sumaCifrelor >= 10 && sumaCifrelor <= 99 ) {
                System.out.println("Suma cifrelor reprezinta un numar de 2 cifre:  " + sumaCifrelor);
            } else if (sumaCifrelor >= 100 && sumaCifrelor <= 999) {
                System.out.println("Suma cifrelor reprezinta un numar de 3 cifre: " + sumaCifrelor);
            } else if (produsulCifrelor > numar) {
                System.out.println("Produsul este mai mare ca numarul dat:  " + produsulCifrelor + " > " + numar);
            }

            System.out.println("Introduceti numarul Y: ");
            int Y = scanner.nextInt();

            if (sumaCifrelor % Y == 0) {
                System.out.println("Suma cifrelor este divizibila cu " + Y);
            } else {
                System.out.println("Suma cifrelor nu este divizibila cu " + Y);
            }
        }

    }
}

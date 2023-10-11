package Structura_Liniara;

import java.util.Scanner;

public class Ex16_ImagineaInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr natural de 3 cifre: ");
        int numar = scanner.nextInt();



            int cifraSuta = numar / 100;
            int cifraZeci = (numar / 10) % 10;
            int cifraUnitati = numar % 10;

            int imagineInversa = cifraUnitati * 100 + cifraZeci * 10 + cifraSuta;

            System.out.println("Imaginea inversă a numărului " + numar + " este: " + imagineInversa);

            scanner.close();
        }
    }


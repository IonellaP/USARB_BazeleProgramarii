package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex3_CelMaiMareNumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul format din 3 cifre: ");
        short N = scanner.nextShort();
        scanner.close();

        if (N >= 100 && N <= 999) {

            short cifra1 = (short) (N / 100);
            short cifra2 = (short) ((N / 10) % 10);
            short cifra3 = (short) (N % 10);


            short maxCifra = cifra1;
            if (cifra2 > maxCifra) {
                maxCifra = cifra2;
            }
            if (cifra3 > maxCifra) {
                maxCifra = cifra3;
            }


            short minCifra = cifra1;
            if (cifra2 < minCifra) {
                minCifra = cifra2;
            }
            if (cifra3 < minCifra) {
                minCifra = cifra3;
            }

            short cifra2Mijloc = (short) (cifra1 + cifra2 + cifra3 - maxCifra - minCifra);


            short numarMaxim = (short) (maxCifra * 100 + cifra2Mijloc * 10 + minCifra);
            System.out.println(numarMaxim);

        }
    }
}

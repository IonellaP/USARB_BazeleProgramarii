package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex7_SumaInverselor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu  primul numar a: ");
        short a = scanner.nextShort();
        System.out.println("Introdu al doilea numar b: ");
        short b = scanner.nextShort();
        System.out.println("Introdu al treilea numar c: ");
        short c = scanner.nextShort();
        System.out.println("Introdu al patrulea numar d: ");
        short d = scanner.nextShort();
        scanner.close();

        if (c > d) {
          short sum = (short) (a + b);
            System.out.println("Suma primelor 2 cifre este: " + sum);
        } else if (c < d ) {
            short produs = (short) (a * b);
            System.out.println("Produsul primelor 2 cifre este: " + produs);
        } else if (c == d) {
            short sumaInverselor = (short) ((1 / a) + (1 / b) + ( 1 / c) + (1 / d));
            System.out.println("Suma inverselor este: " + sumaInverselor);
        }


    }
}

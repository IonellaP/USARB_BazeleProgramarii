package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex1_CeaMaiMareDiferenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima valoare numerica: ");
        short a = scanner.nextShort();
        System.out.println("Introduceti a doua valoare numerica: ");
        short b = scanner.nextShort();
        System.out.println("Introduceti a treia valoare numerica: ");
        short c = scanner.nextShort();

        short maxDiferenta = 0;

        if (( b - a) > maxDiferenta){
            maxDiferenta = (short) (b-a);
        }
        if ((c - a) > maxDiferenta) {
            maxDiferenta = (short) (c - a);
        }
        if ((c - b) > maxDiferenta) {
            maxDiferenta = (short) (c - b);
        }

        System.out.println("Cea mai mare diferenta: " + maxDiferenta);
    }
}

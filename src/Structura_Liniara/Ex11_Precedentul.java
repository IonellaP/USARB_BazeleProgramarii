package Structura_Liniara;

import java.util.Scanner;

public class Ex11_Precedentul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti timpul in care a rezolvat primul elev problema: ");
        short N = scanner.nextShort();


        short M = (short) (N + 10);
        System.out.println("Al doilea elev a rezolvat in " + M);

        short O = (short) (M + 10);
        System.out.println("Al treilea elev a rezolvat in " + O );
    }
}

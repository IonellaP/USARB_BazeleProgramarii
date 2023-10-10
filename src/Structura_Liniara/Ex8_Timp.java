package Structura_Liniara;

import java.util.Scanner;

public class Ex8_Timp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți viteza lui Valentina (V1 km/h): ");
        double V1 = scanner.nextDouble();

        System.out.println("Introduceți viteza lui Marina (V2 km/h): ");
        double V2 = scanner.nextDouble();


        System.out.println("Introduceți distanța inițială (S km): ");
        double S = scanner.nextDouble();


        double vitezaRelativa = Math.abs(V1 - V2);
        double timpIntalnire = S / vitezaRelativa;


        System.out.println("Cele două persoane se vor întâlni în " + timpIntalnire + " ore.");
        scanner.close();
    }
}

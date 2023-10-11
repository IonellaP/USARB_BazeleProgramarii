package Structura_Liniara;

import java.util.Scanner;

public class Ex15_MasinaSiFamilia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți prețul automobilului vechi (N): ");
        double N = scanner.nextDouble();


        System.out.print("Introduceți suma de pe cont (K): ");
        double K = scanner.nextDouble();
        System.out.print("Introduceți prețul automobilului nou (X): ");
        double X = scanner.nextDouble();


        double sumaDupaProcurare = K + N - X;
        System.out.println("Suma de bani pe care familia o va avea după procurarea automobilului este: " + sumaDupaProcurare + " lei");


        scanner.close();
    }
}

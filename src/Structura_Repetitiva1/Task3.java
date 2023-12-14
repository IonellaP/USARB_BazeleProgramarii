package Structura_Repetitiva1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul natural n: ");
        int n = scanner.nextInt();

        double sumaImpare = 0;
        double sumaPare = 0;
         for (int i = 0; i < n; i++){
             System.out.println("Introduceti numarul" + (i + 1) + ": ");
             double numar = scanner.nextDouble();

             if (numar % 2 == 0) {
                 sumaPare+= numar;
             } else {
                 sumaImpare+= numar;
             }
         }

         if (sumaImpare != 0) {

             double raport = sumaImpare / sumaPare;
             System.out.println("Raportul dintre suma numerelor pare si impare este: " + raport);
         } else {
             System.out.println("Raportul nu poate fi calculat");
         }

         scanner.close();
    }
}

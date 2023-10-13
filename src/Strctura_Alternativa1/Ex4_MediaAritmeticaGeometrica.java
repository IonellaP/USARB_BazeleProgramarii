package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex4_MediaAritmeticaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar real: ");
        double a = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar real: ");
        double b = scanner.nextDouble();

        System.out.println("1 - Media aritmetica");
        System.out.println("2 - Media geometrica");

        System.out.print("Introduceti cifra 1 sau 2: ");
        short calc = scanner.nextShort();
        if (calc == 1) {
            double mediaAritmetica = (a + b) / 2;
            System.out.println("Media aritmetica este: " + mediaAritmetica);
        } else if (calc == 2) {
            if (a >=0 && b >=0 ){
                double mediaGeometrica = Math.sqrt(a * b); //Math.sqrt este folosit pentru a calcula radacina patrata
                System.out.println("Media geometrica este: " + mediaGeometrica);
            }else {
                System.out.println("Media geometrica poate fi calculata doar pentru numere pozitive");
            }
        }else {
            System.out.println("A-ti introdus alt numar decat 1 sau 2");
        }
        scanner.close();
    }
}

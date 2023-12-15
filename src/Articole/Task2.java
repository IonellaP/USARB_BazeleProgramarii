package Articole;

import java.util.Scanner;

class Elev {
    String nume;
    String prenume;
    double medieGenerala;
    int absenteNemotivate;
}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elevi (n <= 100): ");
        int numarElevi = scanner.nextInt();
        scanner.nextLine(); // Consumă newline după numărul de elevi

        Elev[] elevi = new Elev[numarElevi];

        for (int i = 0; i < numarElevi; i++) {
            Elev elev = new Elev();
            System.out.println("Introduceti detalii pentru elevul " + (i + 1) + ":");
            System.out.print("Nume: ");
            elev.nume = scanner.nextLine();
            System.out.print("Prenume: ");
            elev.prenume = scanner.nextLine();
            System.out.print("Media generala: ");
            elev.medieGenerala = scanner.nextDouble();
            System.out.print("Numarul de absente nemotivate: ");
            elev.absenteNemotivate = scanner.nextInt();
            scanner.nextLine(); // Consumă newline după absențe nemotivate

            elevi[i] = elev;
        }

        System.out.println(" Elevii cu media peste 8 sunt:");
        for (Elev elev : elevi) {
            if (elev.medieGenerala > 8) {
                System.out.println(elev.nume + " " + elev.prenume + " - Medie: " + elev.medieGenerala);
            }
        }

        System.out.println(" Elevii cu peste 30 de absente nemotivate sunt:");
        for (Elev elev : elevi) {
            if (elev.absenteNemotivate > 30) {
                System.out.println(elev.nume + " " + elev.prenume + " - Absente nemotivate: " + elev.absenteNemotivate);
            }
        }

        double sumaMedii = 0;
        for (Elev elev : elevi) {
            sumaMedii += elev.medieGenerala;
        }
        double mediePeClasa = sumaMedii / numarElevi;
        System.out.println(" Media pe clasă este: " + mediePeClasa);
    }
}


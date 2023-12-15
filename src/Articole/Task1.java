package Articole;


import java.util.Scanner;

class Persoana {
    String nume;
    int varsta;
    double inaltime;
    char sex;
    String stareFamiliala;
}

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de persoane din eșantion (maxim 200): ");
        int numarPersoane = scanner.nextInt();
        scanner.nextLine(); // Consumă newline după numărul de persoane

        Persoana[] echantion = new Persoana[numarPersoane];

        for (int i = 0; i < numarPersoane; i++) {
            Persoana persoana = new Persoana();
            System.out.println("Introduceti detalii pentru persoana " + (i + 1) + ":");
            System.out.print("Nume: ");
            persoana.nume = scanner.nextLine();
            System.out.print("Vârsta: ");
            persoana.varsta = scanner.nextInt();
            scanner.nextLine(); // Consumă newline după vârstă
            System.out.print("Înălțime (metri): ");
            persoana.inaltime = scanner.nextDouble();
            scanner.nextLine(); // Consumă newline după înălțime
            System.out.print("Sex (M/F): ");
            persoana.sex = scanner.nextLine().charAt(0);
            System.out.print("Stare familială: ");
            persoana.stareFamiliala = scanner.nextLine();

            echantion[i] = persoana;
        }

        int persoaneSub18 = 0;
        for (Persoana persoana : echantion) {
            if (persoana.varsta < 18) {
                persoaneSub18++;
            }
        }
        double procentSub18 = (persoaneSub18 * 100.0) / numarPersoane;
        System.out.println("Procentul de persoane sub 18 ani: " + procentSub18 + "%");

        double inaltimeMedie = 0;
        int numarBarbati = 0;
        for (Persoana persoana : echantion) {
            if (persoana.varsta >= 18 && persoana.varsta <= 30 && persoana.sex == 'M') {
                inaltimeMedie += persoana.inaltime;
                numarBarbati++;
            }
        }
        if (numarBarbati > 0) {
            inaltimeMedie /= numarBarbati;
            System.out.println("Înălțimea medie a bărbaților cu vârsta între 18 și 30 ani: " + inaltimeMedie + " metri");
        } else {
            System.out.println("Nu există bărbați cu vârsta între 18 și 30 ani în eșantion.");
        }

        int persoaneCăsătorite = 0;
        for (Persoana persoana : echantion) {
            if (persoana.stareFamiliala.equalsIgnoreCase("căsătorit")) {
                persoaneCăsătorite++;
            }
        }
        double procentCăsătorite = (persoaneCăsătorite * 100.0) / numarPersoane;
        System.out.println("Procentul de persoane căsătorite: " + procentCăsătorite + "%");
    }
}

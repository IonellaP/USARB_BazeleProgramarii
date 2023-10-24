package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex16_PlanulCartezian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți coordonata x a colțului stânga-jos al dreptunghiului: ");
        double xs = scanner.nextDouble();

        System.out.print("Introduceți coordonata y a colțului stânga-jos al dreptunghiului: ");
        double ys = scanner.nextDouble();

        System.out.print("Introduceți coordonata x a colțului dreapta-sus al dreptunghiului: ");
        double xd = scanner.nextDouble();

        System.out.print("Introduceți coordonata y a colțului dreapta-sus al dreptunghiului: ");
        double yd = scanner.nextDouble();

        System.out.print("Introduceți coordonata x a punctului: ");
        double x = scanner.nextDouble();

        System.out.print("Introduceți coordonata y a punctului: ");
        double y = scanner.nextDouble();

        if (x >= xs && x <= xd && y >= ys && y <= yd) {
            System.out.println("Punctul se află în interiorul dreptunghiului.");
        } else {
            System.out.println("Punctul nu se află în interiorul dreptunghiului.");
        }
    }
}

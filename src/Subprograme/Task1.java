package Subprograme;

import javax.swing.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("Ecuatia data este: " + a + "x(2) +" +b +"x + "+ c +" = " + "0" );
        Rezolvare(a,b,c);
    }

    public static void Rezolvare(double a, double b, double c) {
        double delta = b * b - 4*a*c;

        if (delta > 0) {
            double solutia1 = (-b + Math.sqrt(delta)) / (2 * a);
            double solutia2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solutiile ecuatiei sunt: " + "x1= " + solutia1 + " x2= " + solutia2);
        } else if (delta == 0) {
            double solutia = -b / (2 * a);
            System.out.println("Solutia ecuatiei este: " + solutia);
        } else
            {
                System.out.println("Ecuatia nu are solutii");
            }
        }
    }


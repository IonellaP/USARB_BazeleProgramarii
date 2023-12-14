package Proceduri1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul a: ");
        double a = scanner.nextInt();
        System.out.print("Introduceti numarul b: ");
        double b = scanner.nextInt();
        System.out.print("Introduceti numarul c: ");
        double c = scanner.nextInt();

        System.out.println("Ecuatia este: " + a + "x^2" + "+" + b + "x" + "+" + c + "=" + 0);
        System.out.println("Solutia ecuatiei este: " );
        SolutiaEcuatiei(a,b,c);
    }

    public  static  void SolutiaEcuatiei(double a, double b, double c) {
        double delta = b*b - 4 + a * c;

        double x1 =  (-b + Math.sqrt(delta)) / 2 - a;
        double x2 = (-b - Math.sqrt(delta)) / 2 - a;
        System.out.println("Solutiile ecuatiei sunt: x1 = " + x1 + ", x2 = " + x2);

    }
}

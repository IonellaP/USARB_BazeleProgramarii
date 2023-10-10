package Structura_Liniara;

import java.util.Scanner;

public class Ex10_SumaDepusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Suma depusa pe cont: " );
        double R = scanner.nextDouble();

        System.out.println("Procentele marite la sfarsitul lunii: " );
        double W = scanner.nextDouble();

        System.out.print("Introduceți numărul de luni (n): ");
        int n = scanner.nextInt();

        double sumaPeCont = R;
        for (int i = 1; i <= n; i++) {
            sumaPeCont += (W / 100) * sumaPeCont;
        }


        System.out.println("Suma pe cont după " + n + " luni este: " + sumaPeCont);
        scanner.close();
    }
}




package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex17_Ora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți primul interval de timp:");
        System.out.print("Ore: ");
        int h1 = scanner.nextInt();
        System.out.print("Minute: ");
        int m1 = scanner.nextInt();
        System.out.print("Secunde: ");
        int s1 = scanner.nextInt();

        System.out.println("Introduceți al doilea interval de timp:");
        System.out.print("Ore: ");
        int h2 = scanner.nextInt();
        System.out.print("Minute: ");
        int m2 = scanner.nextInt();
        System.out.print("Secunde: ");
        int s2 = scanner.nextInt();

        int totalOre = h1 + h2;
        int totalMinute = m1 + m2;
        int totalSecunde = s1 + s2;

        if (totalSecunde >= 60) {
            totalMinute += totalSecunde / 60;
            totalSecunde = totalSecunde % 60;
        }

        if (totalMinute >= 60) {
            totalOre += totalMinute / 60;
            totalMinute = totalMinute % 60;
        }

        System.out.println("Suma celor două intervale de timp este: " + totalOre + " ore, " + totalMinute + " minute, " + totalSecunde + " secunde.");
    }
}

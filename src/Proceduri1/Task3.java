package Proceduri1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti numarul b: ");
        int b = scanner.nextInt();

        int cmmdc = calculeazaCMMDC(a, b);
        int cmmmc = calculeazaCMMMC(a, b, cmmdc);

        System.out.println("CMMDC al numerelor " + a + " si " + b + " este: " + cmmdc);
        System.out.println("CMMMC al numerelor " + a + " si " + b + " este: " + cmmmc);
    }

    public static int calculeazaCMMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculeazaCMMMC(int a, int b, int cmmdc) {
        return (a * b) / cmmdc;
    }
    }


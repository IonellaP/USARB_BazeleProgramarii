package Structura_Alternativa2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar din 3 cifre: ");
        int num = scanner.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Numarul introdus nu coincide!");
        }

        int sute = num / 100;
        int zeci = (num % 100) / 10;
        int unitate = num % 10;
        System.out.println("Descrierea verbala a numarului: ");

        switch (sute) {
            case 1:
                System.out.println("o suta");
                break;
            case 2:
                System.out.println("doua sute");
                break;
            case 3:
                System.out.println("trei sute");
                break;
            case 4:
                System.out.println("patru sute");
                break;
            case 5:
                System.out.println("cinci sute");
                break;
            case 6:
                System.out.println("sase sute");
                break;
            case 7:
                System.out.println("sapte sute");
                break;
            case 8:
                System.out.println("opt sute");
                break;
            case 9:
                System.out.println("noua sute");
                break;
        }

        if (zeci != 0) {
            System.out.println(" ");
        }
        switch (zeci) {
            case 1:
                System.out.println("zece");
                break;
            case 2:
                System.out.println("douazeci");
                break;
            case 3:
                System.out.println("treizeci");
                break;
            case 4:
                System.out.println("patruzeci");
                break;
            case 5:
                System.out.println("cincizeci");
                break;
            case 6:
                System.out.println("saizeci");
                break;
            case 7:
                System.out.println("saptezeci");
                break;
            case 8:
                System.out.println("optzeci");
                break;
            case 9:
                System.out.println("nouazeci");
                break;
        }

        if (unitate != 0) {
            System.out.println(" ");
        }
        switch (unitate){
            case 1:
                System.out.println("unu");
                break;
            case 2:
                System.out.println("doi");
                break;
            case 3:
                System.out.println("trei");
                break;
            case 4:
                System.out.println("patru");
                break;
            case 5:
                System.out.println("cinci");
                break;
            case 6:
                System.out.println("sase");
                break;
            case 7:
                System.out.println("sapte");
                break;
            case 8:
                System.out.println("opt");
                break;
            case 9:
                System.out.println("noua");
                break;
        }
    }
}

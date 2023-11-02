package Structura_Alternativa2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String numar;
        switch (n) {
            case 0:
                numar = "zero";
                break;
            case 1:
                numar = "unu";
            case 2:
                numar = "doi";
                break;
            case 3:
                numar = "trei";
                break;
            case 4:
                numar = "patru";
                break;
            case 5:
                numar = "cinci";
                break;
            case 6:
                numar = "sase";
                break;
            case 7:
                numar = "sapte";
                break;
            case 8:
                numar = "opt";
                break;
            case 9:
                numar = "noua";
                break;
            default:
                numar = "Nu ati introdus caracterul corespunzator";
                break;
        }
        System.out.println(numar);
    }
}

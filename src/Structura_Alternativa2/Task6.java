package Structura_Alternativa2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Introduceti lungimea segmentului: ");
        double segment = scanner.nextDouble();
        System.out.println("Introdu numarul unitatii de masura 1-dm, 2-km, 3-m, 4-mm, 5-cm: ");
        double unit = scanner.nextDouble();

        double metri;

        switch ((int) unit) {
            case 1:
                metri = segment * 0.1;
                break;
            case 2:
                metri = segment * 1000;
                break;
            case 3:
                metri = segment;
                break;
            case 4:
                metri = segment * 0.001;
                break;
            case 5:
                metri = segment * 0.01;
                break;
            default:
                System.out.println("Numarul unitatii de masura nu este valid.");
                return;
        }

        System.out.println("Lungimea in metri: " + metri);

    }
}

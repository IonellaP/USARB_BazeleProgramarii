package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex6_ZiuaUrmatoare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu ziua curenta: ");
        short zi = scanner.nextShort();
        System.out.println("Introdu luna curenta: ");
        short luna = scanner.nextShort();
        System.out.println("Introdu anul curent: ");
        short anul = scanner.nextShort();
        scanner.close();

        int zileLuna = 31;
        if (zi >= 1 && zi <= 31 && luna >= 1 && luna <= 12) {
            zi += 1;

            if (luna == 2 || luna == 4 || luna == 6 || luna == 11) {
                zileLuna = 30;
            } else if (luna == 2) {
                if ((anul % 4 == 0 && anul % 100 != 0) || (anul % 400 == 0)) {
                    zileLuna = 29;
                } else {
                    zileLuna = 28;
                }
            }
        }

        if (zi > zileLuna) {
            zi = 1;
            luna += 1;
        }
        if (luna > 12) {
            luna = 1;
            anul += 1;
        }

        System.out.println("Ziua urmatoare  este: " + " " + zi + " " + luna + " " + anul);
    }
}

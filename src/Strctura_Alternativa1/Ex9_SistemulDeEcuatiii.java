package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex9_SistemulDeEcuatiii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui X: ");
        double X = scanner.nextDouble();

        if (X < - 3) {
            System.out.println((Math.pow(X, 2) + 1));
        }else  if ((-3 <= X) && (X <= 3)) {
                System.out.println(X - 2);
            } else if (X > 3) {
                System.out.println(2 * (Math.pow(X, 2)) - 5 * X + 1);
            }
        }


    }


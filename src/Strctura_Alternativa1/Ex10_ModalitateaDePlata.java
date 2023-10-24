package Strctura_Alternativa1;

import java.util.Scanner;

public class Ex10_ModalitateaDePlata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti suma de bani S>7: ");
        int S = scanner.nextInt();

        if (S <= 7) {
            System.out.println("Nu se poate plati cu monede de 3 si 5 lei");
        } else if (S % 5 == 0) {
            int numarMonede5 = 5;
            System.out.println("Numarul de monede ce se pot folosi: " + numarMonede5 + " de monede de 5");
        } else {
            int numarMonede5 = S / 5;
            int rest = S % 5;
            int numarMonede3 = 0;

            if (rest % 3 == 0) {
                numarMonede3 = rest / 3;
            } else {
                    numarMonede5--;
                    numarMonede3 = (rest + 5) / 3;
            }
            System.out.println("Se pot dolosi " + numarMonede5 + " monede de 5 si " + numarMonede3 + " monede de 3");
        }

    }
}

package Structura_Repetitiva1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul n: ");
        int n = scanner.nextInt();
        for (int i = 10; i <=99; i++){
            int primul = i / 10 % 100;
            int alDoilea = i % 10;

            if ((primul + alDoilea) == n) {
                System.out.println(i);
            }
        }
    }
}

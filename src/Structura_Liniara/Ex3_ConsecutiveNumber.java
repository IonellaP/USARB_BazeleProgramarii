package Structura_Liniara;

import java.util.Scanner;

public class Ex3_ConsecutiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ionica spune numarul: ");
        int num = scanner.nextInt();

        System.out.println((num-2) + " " + (num-1) +" " + num + " "  + (num+1) + " " + (num+2));
    }
}

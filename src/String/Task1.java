package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul dumneavoastra: ");
        String text = scanner.nextLine();

        String txt = text.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(txt);

    }
}

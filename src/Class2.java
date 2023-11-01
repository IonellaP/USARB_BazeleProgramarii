import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar;
        int count = 0;

        do {
            System.out.print("Introduceti un numar natural: ");
            numar = scanner.nextInt();

            if (numar >= 10 && numar <= 99 && numar % 11 == 0) {
                count++;
            }
        } while (numar != 0);

        System.out.println("Numere identice: " + count);
    }
}

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int numar = scanner.nextInt();

        int count = 0;
        while (numar > 0) {
            int cifra = numar % 10;
            if (cifra == 7) {
                count++;
            }
            numar /= 10;
        }
        System.out.println( count);
    }
}

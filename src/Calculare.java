import java.util.Scanner;

public class Calculare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int i = 2;

        while (i <= n ){
            suma += i;
            i += 2;
        }
        System.out.println("Suma este: " + suma);
    }
}

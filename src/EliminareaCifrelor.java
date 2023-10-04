import java.util.Scanner;

public class EliminareaCifrelor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de 4 cifre: ");
        int num = scanner.nextInt();
        int num2 = (num / 1000) * 10 + (num % 10);
        System.out.println(num);
        System.out.println(num2);
    }
}

import java.util.Scanner;

public class SumaNumerelorFaraPrimul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul din 4 cifre: ");
        int num = scanner.nextInt();

        int num1 = num / 10;
        int num2 = num1 / 10;
        int num3 = num2 / 10;

        int sum = num1 + num2 + num3;
        System.out.print(( num1 )  + "+" + ( num2 ) + "+" + ( num3 ) + " = " + sum);
    }
}

import java.util.Scanner;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ionica spune numbarul: ");
        int num = scanner.nextInt();

        System.out.println(num-2 + " " + (num-1) +" " + num + " "  + (num+1) + " " + (num+2));
    }
}

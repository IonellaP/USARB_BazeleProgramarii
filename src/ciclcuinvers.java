import java.util.Scanner;

public class ciclcuinvers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu numarul format din n cifre");
            int n = scanner.nextInt();
            int inversare= 0;

            while (n != 0) {
                int ultimaCifra = n % 10;
                inversare = inversare * 10 + ultimaCifra;
                n /= 10;
            }
            System.out.println(inversare);

        }
    }

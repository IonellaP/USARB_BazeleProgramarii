import java.util.Scanner;

public class MediaDiferentaVarstei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta 1: ");
        int varsta1 = scanner.nextInt();
        System.out.println("Introduceti varsta 2: ");
        int varsta2 = scanner.nextInt();

        double media = (double) (varsta1 + varsta2) / 2;
        System.out.println("Media varstelor: " + media);

        int diferenta = varsta1 - varsta2;
        System.out.println("Diferenta varstelor: " + diferenta);
    }
}

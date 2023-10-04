import java.util.Scanner;

public class CalculareAni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de ani: ");
        int ani = scanner.nextInt();


        int zileAni = ani * 365;
        int luniAni = ani * 30;
        int oreAni = ani * 24;
        System.out.println("Zile timp de " + ani + " ani:  " + zileAni );
        System.out.println("Luni timp de " + ani + " ani: " + luniAni);
        System.out.println("Ore timp de " + ani + " ani: " + oreAni);

    }
}

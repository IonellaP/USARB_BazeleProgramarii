import java.util.Scanner;

public class FregventareaGradinitei {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter n zile care a frecventat copilul: ");
        double n = scanner.nextDouble();

        double plataOZi = 65.5;
        double S = plataOZi * n;
        System.out.println("Plata pentru " + n + " zile " + " este de " + S);


    }
}

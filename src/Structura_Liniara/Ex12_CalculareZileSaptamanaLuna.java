package Structura_Liniara;

import java.util.Scanner;

public class Ex12_CalculareZileSaptamanaLuna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul N: ");
        int N = scanner.nextInt();

        int Ore_Zile =N * 24;
        int Minute_Zile = Ore_Zile * 60;
        int Secunde_Zile = Minute_Zile * 60;
        System.out.println("In " + N + " zile sunt: " + " Ore " + Ore_Zile + " Minute " +Minute_Zile + " secunde " + Secunde_Zile);

        int Ore_Saptamana = N * 7 * 24;
        int Minute_Saptamana = Ore_Saptamana * 60;
        int Secunde_Saptamana = Minute_Saptamana * 60;
        System.out.println("In " + N + " saptamani sunt: " + " Ore " + Ore_Saptamana + " Minute " + Ore_Saptamana + " secunde " + Secunde_Saptamana);


        int Ore_Luna_Mai = 31 * 24;
        int Minute_Luna_Mai = Ore_Luna_Mai * 60;
        int Secunde_Luna_Mai = Minute_Luna_Mai * 60;
        System.out.println("In luna mai sunt: " + " Ore " + Ore_Luna_Mai + " Minute " + Ore_Luna_Mai + " secunde " + Secunde_Luna_Mai);

    }
}

package Proceduri2;

public class Task7 {
    public static void main(String[] args) {
        int k = 1234567;

        int rezultat = NUMAR(k);
        System.out.println("Valoarea obținută eliminând prima și ultima cifră: " + rezultat);
    }

    public static int NUMAR(int k) {
        int numarCifre = (int)(Math.log10(k) + 1);

        if (numarCifre >= 3) {
            int ultimaCifra = k % 10;
            int primaCifra;

            while (k >= 10) {
                k /= 10;
            }
            primaCifra = k;

            int rezultat = (k - primaCifra) / 10;
            rezultat = rezultat * (int)Math.pow(10, numarCifre - 2) + ultimaCifra;

            return rezultat;
        } else {
            System.out.println("Numărul nu are cel puțin 3 cifre!");
            return -1;
        }
    }
}

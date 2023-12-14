package Proceduri2;

public class Task1 {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int c = 48;

        int cmmcdFinal = cmmcdTreiNumere(a, b, c);
        System.out.println("CMMDC al celor trei numere este: " + cmmcdFinal);
    }

    public static int cmmcdDouaNumere(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return cmmcdDouaNumere(y, x % y);
        }
    }

    public static int cmmcdTreiNumere(int a, int b, int c) {
        int cmmcdAB = cmmcdDouaNumere(a, b);
        int cmmcdFinal = cmmcdDouaNumere(cmmcdAB, c);
        return cmmcdFinal;
    }
}

package Proceduri2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Numerele palindrom din intervalul 100 - 300 care devin palindroame când sunt ridicate la pătrat sunt:");

        for (int i = 100; i <= 300; i++) {
            if (verificaPalindrom(i) && verificaPalindrom(i * i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean verificaPalindrom(int numar) {
        int invers = 0;
        int temp = numar;

        while (temp != 0) {
            int cifra = temp % 10;
            invers = invers * 10 + cifra;
            temp = temp / 10;
        }

        return numar == invers;
    }
}

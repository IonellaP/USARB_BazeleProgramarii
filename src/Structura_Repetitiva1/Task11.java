package Structura_Repetitiva1;

public class Task11 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int primeleCifre = i / 10 % 100;
            int ultimaCifra = i % 10;

            int patrat1 = primeleCifre * primeleCifre;
            int patrat2 = ultimaCifra * ultimaCifra;

            int diferenta = patrat1 - patrat2;

            if (i == diferenta) {
                System.out.println("numerele de 3 cifre, care sunt egale cu diferența dintre pătratul numărului alcătuit din primele 2 cifre și pătratul ultimei cifre sunt: " + i);
            }
        }
    }
}

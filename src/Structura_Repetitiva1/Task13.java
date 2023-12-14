package Structura_Repetitiva1;

public class Task13 {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int numar = 3000 + a * 100 + 20 * b;
                if (numar % 9 == 0 ){
                    System.out.println(numar);
                }
            }
        }
    }
}

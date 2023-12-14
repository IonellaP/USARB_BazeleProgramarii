package Structura_Repetitiva1;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++){
            if (i >10) {
                if ((i % 10) % 3 == 0) {
                    System.out.println(i++);
                }
            }
        }
    }
}

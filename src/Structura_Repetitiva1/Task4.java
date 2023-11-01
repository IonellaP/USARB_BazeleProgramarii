package Structura_Repetitiva1;

public class Task4 {
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            if ((num % 10 == 3 || num % 10 == 6 || num % 10 == 9) && num % 10 != 0) {
                System.out.println(num);
            }
        }
    }
}
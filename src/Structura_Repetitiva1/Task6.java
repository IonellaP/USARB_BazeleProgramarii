package Structura_Repetitiva1;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int firstNum = i / 100;
            int secondNum = (i % 100) / 10;
            int lastNum = i % 10;

            int sum = firstNum + secondNum + lastNum;
            if (sum % 5 == 0){
                System.out.println("suma este divizibila cu 5: " + i );
            }
        }



    }

}

package String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti propozitiile (pentru a opri tastati 'stop'): " );

        int numProp = 0;
        int numCuv = 0;

        while (true) {
            String prop = scanner.next();

            if (prop.equalsIgnoreCase("stop")){
                break;
            }
            numProp++;

            String[] cuvinte = prop.split("\\s+");
            numCuv+= cuvinte.length;
        }
        System.out.println("Numarul de propozitii: " + numProp);
        System.out.println("Numarul de cuvinte: " + numCuv);

    }
}

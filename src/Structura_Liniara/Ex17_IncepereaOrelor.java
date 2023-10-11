package Structura_Liniara;

public class Ex17_IncepereaOrelor {
    public static void main(String[] args) {
        short oraDeIncepere = 8;
        short minuteleDeIncepere = 0;

        short totalMinutes = 7 * (45 + 10) + 2 * 15;
        short ore = (short) (totalMinutes / 60);
        short minute = (short) (totalMinutes % 60);

        short sfarsitulOre = (short) (oraDeIncepere + ore);
        short sfarsitulMinute = (short) (minuteleDeIncepere + minute);

        System.out.println("Ora de icheiere a lectiei a 7 este: " + sfarsitulOre + " " + sfarsitulMinute + " minute" );

    }
}

import java.util.Scanner;

public class Exemple_9_3_Array {
    public static void main(String[] args) {

        int numAlumnes;

        float[] notesDaw;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Introdueix número d'alumnes: ");
            numAlumnes = input.nextInt();

            if (numAlumnes <= 0){
                System.out.println("Error: Valor impossible");
            }
        }while(numAlumnes <= 0);

        notesDaw = new float[numAlumnes];

        for (int i = 0; i < notesDaw.length; i++) {
            do {
                System.out.print("Escriu la nota de l'alumne " + (i+1) + ": ");
                notesDaw[i] = input.nextFloat();
                if (notesDaw[i] > 10 || notesDaw[i] < 0){
                    System.out.println("Error: Valor impossible");
                }
            }while(notesDaw[i] > 10 || notesDaw[i] < 0);
        }
        for (int i = 0; i < notesDaw.length; i++) {
            System.out.println("La nota de l'alumne " + (i+1) + " és: " + notesDaw[i]);
        }
    }
}

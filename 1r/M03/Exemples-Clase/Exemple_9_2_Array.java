import java.util.Scanner;

public class Exemple_9_2_Array {
    public static void main(String[] args) {

        int numAlumnes;

        float[] notesDaw;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix número d'alumnes: ");
        numAlumnes = input.nextInt();
        notesDaw = new float[numAlumnes];

        for (int i = 0; i < notesDaw.length; i++) {
            System.out.print("Escriu la nota de l'alumne " + (i+1) + ": ");
            notesDaw[i] = input.nextFloat();
        }
        for (int i = 0; i < notesDaw.length; i++) {
            System.out.println("Alumne " + (i+1) + " és: " + notesDaw[i]);
        }
    }
}

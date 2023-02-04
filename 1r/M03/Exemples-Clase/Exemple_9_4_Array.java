import java.util.Scanner;

public class Exemple_9_4_Array {
    public static void main(String[] args) {

        int numAlumnes;

        float[] notesDaw;

        String[] nomAlumnes;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Introdueix el número d'alumnes a l'aula: ");
            numAlumnes = input.nextInt();
            input.nextLine();

            if (numAlumnes <= 0){
                System.out.println("Error: Valor impossible");
            }
        }while(numAlumnes <= 0);

        notesDaw = new float[numAlumnes];
        nomAlumnes = new String[notesDaw.length];

        for (int i = 0; i < notesDaw.length; i++) {
            System.out.print("Escriu el nom de l'alumne " + (i+1) + ": ");
            nomAlumnes[i] = input.next();
        }

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
            System.out.println("La nota de l'alumne " + nomAlumnes[i] + " és: " + notesDaw[i]);
        }
    }
}

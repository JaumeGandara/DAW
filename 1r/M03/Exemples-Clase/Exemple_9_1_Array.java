import java.util.Scanner;

public class Exemple_9_1_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Collection
        Array
        Vector

        Per canviar un valor en específic haurem de ficar el nom de la variable
        i després el número de posició (es comença pel 0).
        Exemple:
        notesDaw1[3] = 9.5f;
         */

        System.out.print("Introdueix número d'alumnes: ");
        int numAlumnes;
        numAlumnes = input.nextInt();
        //Declarem estructura vector tipus float = inicialitzem vector amb 35 valors 0.0f;
        float[]notesDaw1 = new float[numAlumnes];
    }
}

/*
3. Programar un algoritmo recursivo que permita sumar los elementos de un vector.
*/

import java.util.Scanner;

public class GandaraJaume_Exercici3 {
    /**
     * Mètode main que crida al mètode menu()
     * @param args
     */
    public static void main(String[] args) {
        int mida = inputIntMin("Quants números vols sumar?\n > ","ERROR: Tipatge incorrecte",2,"ERROR: Introdueix un valor més gran que 0");
        float[] vector = new float[mida];

        omplirVector(vector);

        System.out.println("El resultat és " + sumarVector(vector, mida-1, 0));
    }

    /**
     * Mètode per omplir el vector
     * @param vector de tipus float[]
     * @return vectorInterior de tipus float[] que és el vector amb tots els valors
     */
    private static float[] omplirVector(float[] vector) {
        float[] vectorInterior = vector;

        for (int i = 0; i < vectorInterior.length; i++) {
            vectorInterior[i] = inputFloat("Introdueix el número de la columna " + (i+1) + ": ","ERROR: Tipatge incorrecte");
        }

        return vectorInterior;
    }

    /**
     * Mètode per sumar tots els números d'un vector
     * @param vector de tipus float[]
     * @param mida de tipus int
     * @return resultat de tipus float[] que és la suma de tots els números del vector
     */
    private static float sumarVector(float[] vector, int mida, float resultat){
        if(mida == -1){
            return resultat;
        }else {
            resultat += vector[mida];
            return resultat = sumarVector(vector,mida-1,resultat);
        }
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus int
     * @param error2 de tipus String
     * @return value de tipus int
     */
    private static int inputIntMin(String text, String error1,int min, String error2){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            }else {
                value = input.nextInt();
                if (min > value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus float
     */
    private static float inputFloat(String text, String error){
        Scanner input = new Scanner(System.in);

        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextFloat();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
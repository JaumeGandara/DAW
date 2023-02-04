//Permeti introduïr les notes.
//Afegir control d'errors de tipatge i domini [0-10]

import java.util.Scanner;

public class Exemple_11_2_ArrayNotes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] scores;

        float sumClassScore = 0f;

        boolean tipatgeCorrecte;

        System.out.println("Benvingut/da al programa...");

        scores = new float[5];

        for (int i = 0; i < scores.length; i++) {
            do {
                System.out.print("Nota alumne " + (i+1) + ": ");
                tipatgeCorrecte = input.hasNextFloat();

                if (!tipatgeCorrecte){
                    System.out.println("Error: Valor no numèric");
                }else {
                    scores[i] = input.nextFloat();
                    if (scores[i] > 10 || scores[i] < 0){
                        System.out.println("CACA");
                        tipatgeCorrecte = false;
                    }
                }
                input.nextLine();
            }while(!tipatgeCorrecte);
        }

        for (int i = 0; i < scores.length; i++) {
            sumClassScore = sumClassScore + scores[i];
        }

        System.out.println("Media clase: " + sumClassScore/scores.length);
    }
}

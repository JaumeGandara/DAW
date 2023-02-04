import java.util.Scanner;

public class GandaraJaume_Exercici5 {
    /**
     * Mètode main que crida al mètode menu()
     * @param args
     */
    public static void main(String[] args) {
        int fila = inputIntMin("Quantes files vols?\n > ","ERROR: Tipatge incorrecte",2,"ERROR: Introdueix un valor més gran que 0");
        int columna = inputIntMin("Quants columnes vols?\n > ","ERROR: Tipatge incorrecte",2,"ERROR: Introdueix un valor més gran que 0");
        float[][] matriu = new float[fila][columna];

        omplirMatriu(matriu);

        System.out.println("El resultat és " + sumarMatriu(matriu,0,0,0));
    }

    /**
     * Mètode per omplir la matriu
     * @param matriu de tipus float[][]
     * @return matriuInterior de tipus float[][] que el la matriu amb tots el valors
     */
    private static float[][] omplirMatriu(float[][] matriu){
        float[][] matriuInterior = matriu;

        for (int i = 0; i < matriuInterior.length; i++) {
            for (int j = 0; j < matriuInterior[i].length; j++) {
                matriuInterior[i][j] = inputFloat("Introdueix el número de la fila " + (i+1) + " columna "+ (j+1) +": ","ERROR: Tipatge incorrecte");
            }
        }

        return matriuInterior;
    }

    /**
     * Mètode sumar tots el valor d'una matriu
     * @param matriu de tipus float[][]
     * @param fila de tipus int
     * @param columna de tipus int
     * @param resultat de tipus float
     * @return resultat de tipus float que és la suma de tots els valors de la matriu
     */
    private static float sumarMatriu(float[][] matriu, int fila, int columna, float resultat){
        if(fila < matriu.length){
            if(columna < matriu[fila].length){
                resultat += matriu[fila][columna];
                resultat = sumarMatriu(matriu,fila,columna+1,resultat);
            }else{
                resultat = sumarMatriu(matriu,fila+1,0,resultat);
            }
        }
        return resultat;
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

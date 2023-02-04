/*
1. Programar un algoritmo recursivo que permita hacer la división por restas sucesivas.
 */

import java.util.Scanner;

public class GandaraJaume_Exercici1 {
    /**
     * Mètode main
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Benvingut/da al programa...");
        System.out.println(divisio(inputInt("Introdueix el valor 1: ","ERROR: Tipatge incorrecte"),inputInt("Introdueix el valor 2: ","ERROR: Tipatge incorrecte")));
    }

    /**
     * Mètode per fer la divisió per restes successives
     * @param valor1 de tipus int
     * @param valor2 de tipus int
     * @return resultat de la divisió
     */
    private static int divisio(int valor1, int valor2) {
        if (valor1 < valor2){
            return 0;
        }else {
            return 1 + divisio(valor1-valor2,valor2);
        }
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus int
     */
    private static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
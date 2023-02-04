/*
Desenvolupeu un programa java usant mètodes en programació modular que llegeixi un valor float (preu de cost)
per teclat i que en retorni el preu de venda al públic incrementant el cost llegit en un +21%.

Feu com a mínim els següents mètodes:

Un mètode per llegir un float de teclat amb control d'errors
Un mètode per demanar el cost del producte a l'usuari
Un mètode per calcular el preu de venda amb l'increment d'IVA +21%.
Mètode main
 */

import java.util.Scanner;

public class AC01_Calculadora_PVP {
    /**
     * Mètode main per començar l'execució del programa
     * @param args
     */
    public static void main(String[] args) {
        float cost = inputControl();
        calculIVA(cost);
        System.out.println(calculIVA(cost));
    }

    /**
     * Aquest mètode serveix per llegir un float de teclat amb control d'errors
     * @return preuCost de tipus float
     */
    private static float inputControl() {
        Scanner input = new Scanner(System.in);

        float preuCost = 0;
        boolean correctTyping = false;

        do {
            demanarPreu();
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println("Has d'escriure un número");
            } else {
                preuCost = input.nextFloat();
                if (preuCost < 0) {
                    System.out.println("Has d'escriure un nombre positiu!");
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return preuCost;
    }

    /**
     * Aquest mètode serveix per demanar el cost del producte a l'usuari
     */
    private static void demanarPreu() {
        System.out.print("Introdueix el preu de cost: ");
    }

    /**
     * Aquest mètode serveix per calcular el preu de venda amb l'increment d'IVA +21%
     * @param cost de tipus float
     * @return preuIVA de tipus float
     */
    private static float calculIVA(float cost) {
        float preuIVA = cost * 1.21f;

        return preuIVA;
    }
}
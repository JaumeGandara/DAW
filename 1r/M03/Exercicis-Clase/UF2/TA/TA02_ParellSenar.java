/*
Usant mètodes de la programació modular, desenvolupeu un programa en Java
capaç de comprovar si donat un número enter, aquest és parell o senar.

Feu com a mínim els següents mètodes:

    - Un mètode per obtenir un int amb control d'errors
    - Un mètode que comprovi si el número introduït és parell (retorna True) o senar (retorna False)
    - El mètode del Main principal que crida i usa als dos mètodes anteriors
 */

import java.util.Scanner;

public class TA02_ParellSenar {
    public static void main(String[] args) {
        boolean parellSenar = esParell();
        System.out.println("El número introduït és parell --> " + parellSenar);
    }


    public static boolean esParell(){
        boolean resultat = true;

        if (inputInt("Escriu un número: ", "ERROR: Tipus de dades no correcte") % 2 == 0){
            resultat = true;
        }else {
            resultat = false;
        }

        return resultat;
    }


    public static int inputInt(String order, String error1) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctTyping;

        do {
            System.out.print(order);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                x = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }
}
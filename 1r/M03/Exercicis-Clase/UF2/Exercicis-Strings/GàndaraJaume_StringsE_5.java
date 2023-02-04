/*
5. Escriviu un programa que agafi un vector de paraules i ens digui quina és la
més llarga i quina longitud té.
 */

import java.util.Scanner;

public class GàndaraJaume_StringsE_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] vector;

        int option = 0;
        int vegades = 0;
        String cadena;

        do {
            System.out.print("Insereix 1 per afegir paraula al vector i 2 per sortir i veure quina és la més llarga i quina longitut té: ");
            option = input.nextInt();

            System.out.println("Insereix paraula");
            cadena = input.next();

            vector[vegades] = cadena;

            vector = cadena.toCharArray();

            vegades = vegades++;
        }while(option != 2);


    }
}

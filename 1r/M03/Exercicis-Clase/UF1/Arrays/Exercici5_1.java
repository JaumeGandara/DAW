/*
5. Crear un programa que lea por teclado un vector de 10 números
enteros y lo desplace una posición hacia la derecha: el primer
elemento pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente; el último elemento pasa a ser el
primero.
 */

import java.util.Scanner;

public class Exercici5_1 {
    // Serveix per crear el mètode executable
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] valors = new int[10];
        boolean tipatgeCorrecte;

        for (int i = 0; i < valors.length; i++) {
            do{
                System.out.print("Escriu el valor de la posició " + i + ": ");
                tipatgeCorrecte = llegir.hasNextInt();

                if (!tipatgeCorrecte){
                    System.out.println("ERROR: Tipus de dades no correcte");
                }else{
                    valors[i] = llegir.nextInt();
                }
                llegir.nextLine();
            }while(!tipatgeCorrecte);
        }

        for (int i = 0; i < valors.length; i++) {
            System.out.print("[" + valors[i] + "]");
        }

        int aux = valors[0];
        for (int i = 0; i < valors.length - 1; i++) {
            valors[i] = valors[i+1];
        }
        valors[valors.length-1] = aux;

        System.out.println("\nDesprés de desplaçar a l'esquerra...");
        for (int i = 0; i < valors.length; i++) {
            System.out.print("[" + valors[i] + "]");
        }

        aux = valors[valors.length-1];
        for (int i = valors.length - 1; i > 0; i--) {
            valors[i] = valors[i-1];
        }
        valors[0] = aux;

        System.out.println("\nDesprés de desplaçar a la dreta...");
        for (int i = 0; i < valors.length; i++) {
            System.out.print("[" + valors[i] + "]");
        }

    }
}

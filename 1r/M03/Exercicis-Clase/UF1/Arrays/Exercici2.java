/*
2. Leer 5 números por teclado, guardarlos en un vector y
mostrarlos en orden inverso al introducido.
*/

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] comptar = new int[5];

        System.out.println("Benvingut/da al programa...");
        System.out.println("Escriu 5 números enters per després veure'ls en ordre invers en el qual els has escrits...");

        for (int i = 0; i < comptar.length; i++) {
            System.out.print("Escriu el valor " + (i+1) + ": ");
            comptar[i] = input.nextInt();
        }

        for (int i = comptar.length-1; i >= 0; i--) {
            System.out.println(comptar[i]);
        }
    }
}

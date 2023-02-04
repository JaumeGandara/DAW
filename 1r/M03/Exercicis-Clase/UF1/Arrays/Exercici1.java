/*
1. Leer 5 números por teclado, guardarlos en un vector y
mostrarlos en el mismo orden introducido. (Utilizaremos un
bucle para pedir los valores al usuario y guardarlos al
vector; y otro bucle para mostrarlos).
 */

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] comptar = new int[5];

        System.out.println("Benvingut/da al programa...");
        System.out.println("Escriu 5 números enters");

        for (int i = 0; i < comptar.length; i++) {
            comptar[i] = input.nextInt();
        }

        for (int i = 0; i < comptar.length; i++) {
            System.out.println(comptar[i]);
        }
    }
}
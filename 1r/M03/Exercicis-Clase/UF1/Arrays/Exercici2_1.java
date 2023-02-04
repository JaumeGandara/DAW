/*
2. Leer 5 números por teclado, guardarlos en un vector y
mostrarlos en orden inverso al introducido.
*/

import java.util.Scanner;

public class Exercici2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long[] numeros;

        byte longitudVector = 0;

        boolean valorCorrecte;

        System.out.println("Benvingut/da al programa...");

        do {
            System.out.println("Quants números vols guardar?");
            valorCorrecte = input.hasNextByte();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no correcte! (escriu un numero enter)");
            }else {
                longitudVector = input.nextByte();
                if (longitudVector < 2 || longitudVector > 10){
                    System.out.println("ERROR: Valor incorrecte! (escriu un valor del 2 al 10)");
                    valorCorrecte = false;
                }
            }
            input.nextLine();
        }while(!valorCorrecte);

        numeros = new long[longitudVector];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escriu el valor " + (i+1) + ": ");
            numeros[i] = input.nextLong();
        }

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("[" + numeros[i] + "]");
        }
    }
}

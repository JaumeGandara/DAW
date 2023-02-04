import java.util.Scanner;

/*
4. Leer por teclado dos vectores de 10 números y mezclarlos en un
tercer vector con el siguiente orden:
    • el primer elemento del vector 1
    • el primer elemento del vector 2
    • el segundo elemento del vector 1
    • el segundo elemento del vector 2
    • ……
 */

public class Exercici4_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] vector1 = new float[10], vector2 = new float[10];
        float[] vectorFinal = new float[vector1.length*2];
        int contador = 0;

        System.out.println("S'escriuràn 10 números al primer vector...");
        System.out.println("S'escriuràn 10 números al segon vector...");

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (float)(Math.random()*25);
            vector2[i] = (float)(Math.random()*25);
        }

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("El valor de vector1["+i+"] és "+vector1[i]);
            System.out.println("El valor de vector2["+i+"] és "+vector2[i]);
            vectorFinal[contador] = vector1[i];
            contador++;
            vectorFinal[contador] = vector2[i];
            contador++;
        }

        for (float aux: vectorFinal) {
            System.out.println(aux);
        }
    }
}

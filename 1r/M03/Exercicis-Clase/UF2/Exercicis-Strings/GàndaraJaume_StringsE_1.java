/*
1. Escriu un programa per calcular la longitud d'una cadena i que ho mostri per pantalla.
*/

import java.util.Scanner;

public class GàndaraJaume_StringsE_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena;

        System.out.println("Escriu qualsevol cosa");

        cadena = input.nextLine();

        System.out.println(cadena.length());
    }
}
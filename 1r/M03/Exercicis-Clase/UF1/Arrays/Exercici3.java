/*
3. Leer 5 números por teclado y a continuación realizar la media
de los números positivos, la media de los números negativos y
contar el número de ceros.
 */

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros;
        int quantitatPositius = 0;
        int quantitatNegatius = 0;
        int quantitatZeros = 0;
        int sumatoriPositius = 0;
        int sumatoriNegatius = 0;
        int sumatoriZeros = 0;

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
                if (longitudVector < 2 || longitudVector > 5){
                    System.out.println("ERROR: Valor incorrecte! (escriu un valor del 2 al 5)");
                    valorCorrecte = false;
                }
            }
            input.nextLine();
        }while(!valorCorrecte);

        numeros = new int[longitudVector];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escriu el valor " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0){
                quantitatZeros++;
                sumatoriPositius = sumatoriZeros + numeros[i];
            } else if (numeros[i] < 0) {
                quantitatNegatius++;
                sumatoriPositius = sumatoriNegatius + numeros[i];
            }else {
                quantitatPositius++;
                sumatoriPositius = sumatoriPositius + numeros[i];
            }
        }
        System.out.println("Al vector hi ha " + quantitatZeros + " 0s");
        System.out.println("Al vector hi ha " + quantitatNegatius + " negatius");
        System.out.println("Al vector hi ha " + quantitatPositius + " positius");
        System.out.println("La mitjana dels valors zeros és " + (sumatoriZeros/(float)quantitatZeros));
        System.out.println("La mitjana dels valors negatius és " + (sumatoriNegatius/(float)quantitatNegatius));
        System.out.println("La mitjana dels valors positius és " + (sumatoriPositius/(float)quantitatPositius));
    }
}

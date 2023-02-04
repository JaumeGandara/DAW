/*
4. Leer por teclado dos vectores de 10 números y mezclarlos en un
tercer vector con el siguiente orden:
• el primer elemento del vector 1
• el primer elemento del vector 2
• el segundo elemento del vector 1
• el segundo elemento del vector 2
• ……
 */

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        int[] vectorC = new int[20];

        boolean tipatgeCorrecte;

        for (int i = 0; i < vectorA.length; i++) {
            do{
                System.out.print("Escriu el valor " + (i+1) + " del vector A: ");
                tipatgeCorrecte = input.hasNextInt();

                if (!tipatgeCorrecte){
                    System.out.println("ERROR: Tipus de dades no correcte");
                }else{
                    vectorA[i] = input.nextInt();
                }
                input.nextLine();
            }while(!tipatgeCorrecte);
        }

        for (int i = 0; i < vectorB.length; i++) {
            do{
                System.out.print("Escriu el valor " + (i+1) + " del vector B: ");
                tipatgeCorrecte = input.hasNextInt();

                if (!tipatgeCorrecte){
                    System.out.println("ERROR: Tipus de dades no correcte");
                }else{
                    vectorB[i] = input.nextInt();
                }
                input.nextLine();
            }while(!tipatgeCorrecte);
        }

        for (int i = 0; i < vectorC.length; i+=2) {
            vectorC[i] = vectorA[i/2];
            vectorC[i+1] = vectorB[i/2];
        }

        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + "; ");
        }
    }
}

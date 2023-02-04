/*
2. Programar un algoritmo recursivo que permita sumar los dígitos de un número.Ejemplo:
Entrada:123
Resultado:6
 */

import java.util.Scanner;

public class GandaraJaume_Exercici2 {
    public static void main(String[] args) {
        System.out.println("Benvingut/da al programa...");
        System.out.println(suma(inputInt("Introdueix un número amb més d'una xifra (Exemple: 1234, 112, 546): ","ERROR: Valor fora de rang"),0));
    }

    /**
     * Mètode per fer la suma dels digits d'un número
     * @param numero de tipus int
     * @param sumaValor de tipus int
     * @return resultat de la suma
     */
    private static int suma(int numero, int sumaValor){
        if(numero > 0){
            sumaValor += numero % 10;
            numero /= 10;
            sumaValor = suma(numero, sumaValor);
        }
        return sumaValor;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus int
     */
    private static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
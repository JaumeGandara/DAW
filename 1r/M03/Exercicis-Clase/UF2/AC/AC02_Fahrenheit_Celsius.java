/*
Usant programació modular en java, desenvolupa un programa amb mètodes que permeti convertir les temperatures
expressades en graus Fahrenheit a Celsius i viceversa. Usarem valors enters positius i negatius!

El transformador de mesures ha de tenir un menú principal que permeti escollir el tipus de conversió
(de Fahrenheit a Celsius o de Celsius a Fahrenheit. El programa no acaba fins que no s'escull l'opció de sortir.

Les fórmules de conversió són les següents:

fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 /9) * (fahrenheit - 32)
El programa ha de tenir com a mínim els següents mètodes:

Menú principal
Control d'errors per a valors enters
Càlcul de F a C
Càlcul de C a F
 */

import java.util.Scanner;

public class AC02_Fahrenheit_Celsius {
    /**
     * Mètode main amb el switch case
     * @param args
     */
    public static void main(String[] args) {

        final String MISSATGE_MENU = "Les opcions del menú són:" +
                                "\n\t1- Canviar a Celsius" +
                                "\n\t2- Canviar a Fahrenheit" +
                                "\n\t3- Sortir";

        int opcio = 0;
        float temperatura = 0;

        do {
            opcio = inputInt(MISSATGE_MENU,"ERROR: Tipatge incorrecte");
            switch (opcio){
                case 1:
                    temperatura = celsius();
                    System.out.println("La temperatura en Celsius és: " + temperatura);
                    break;
                case 2:
                    temperatura = fahrenheit();
                    System.out.println("La temperatura en Fahrenheit és: " + temperatura);
                    break;
                case 3:
                    System.out.println("Adeu...");
                    break;
                default:
                    System.out.println("Valor fora de rang");
                    break;
            }
        }while(opcio != 3);
    }

    /**
     * Mètode per llegir variables int amb 2 controls d'erros (de tipatge i amb màxim i mínim)
     * @param text de tipus String
     * @param error1 de tipus String
     * @return x de tipus int
     */
    private static int inputInt(String text, String error1) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctTyping;

        do {
            System.out.println(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                x = input.nextInt();
            }
            input.nextLine();
        }while(!correctTyping);

        return x;
    }

    /**
     * Mètode per llegir variables float amb control d'errors de tipatge
     * @param text de tipus String
     * @param error de tipus String
     * @return x de tipus float
     */
    private static float inputFloat(String text, String error) {
        Scanner input = new Scanner(System.in);

        float x = 0;
        boolean correctTyping = false;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                x = input.nextFloat();
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }

    /**
     * Mètode per convertir els Fº en Cº
     * @return y de tipus float
     */
    private static float celsius() {
        float x = inputFloat("Introdueix la temperatura en Fahrenheit per convertir-la en Celsius: ", "ERROR: Tipatge incorrecte");
        float y = (float) ((5.0 /9) * (x - 32));
        return y;
    }

    /**
     * Mètode per convertir els Cº en Fº
     * @return de tipus float
     */
    private static float fahrenheit() {
        float x = inputFloat("Introdueix la temperatura en Celsius per convertir-la en Fahrenheit: ", "ERROR: Tipatge incorrecte");
        float y = (float) ((9.0 / 5) * x + 32);
        return y;
    }
}
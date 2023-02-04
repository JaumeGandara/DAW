import java.util.Scanner;

public class Exemple_15_1_CalculadoraPVP {
    public static void main(String[] args) {
        float costProducte = demanarFloat();
        float preuVendaPublic = calcularPVP(costProducte, 1.21f);
        System.out.println("El cost del producte era " + costProducte + "€ i amb l'iva és " + preuVendaPublic + "€");
    }

    /**
     * Mètode demana el cost d'un producte
     * @return valor de tipus float
     */
    private static float demanarFloat() {
        float valor = inputFloat("Escriu el cost del producte: ", "ERROR: Tipus de dades no correcte", 0f, 1000f, "ERROR: Valor de dades fora de rang");
        return valor;
    }

    /**
     * Mètode per llegir un float per teclat amb control d'errors i domini de valors
     * @param order de tipus String
     * @param error1 de tipus String
     * @param min de tipus float
     * @param max de tipus float
     * @param error2 de tipus String
     * @return x de tipus float
     */
    public static float inputFloat(String order, String error1, float min, float max, String error2) {
        Scanner input = new Scanner(System.in);

        float x = 0;
        boolean correctTyping;

        do {
            System.out.print(order);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                x = input.nextFloat();
                if (x < min || x > max){
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }

    /**
     * Mètode per calcular l'iva
     * @param costProducte de tipus float
     * @param iva de tipus float
     * @return pvp de tipus float
     */
    private static float calcularPVP(float costProducte, float iva) {
        float pvp = costProducte * iva;
        return pvp;
    }
}

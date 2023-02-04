import java.util.Scanner;

public class Exemple_14_2_publicClass {
    public static void main(String[] args) {
        String nom = demanarNom();
        ferSalutacio(nom);
    }

    /**
     * Aquest mètode serveix per demanar un String per teclat i retornar-lo i el private només serveix dins de les {}
     * @return nomPersona de tipus String
     */

    private static String demanarNom() {
        Scanner input = new Scanner(System.in);
        boolean nameAccepted = false;
        String nomPersona;

        do {
            System.out.print("Escriu el teu nom: ");
            nomPersona = input.nextLine();

            if (nomPersona.equalsIgnoreCase("Caca")){
                System.out.println("El nom no pot ser 'Caca'");
                nameAccepted = false;
            }else {
                nameAccepted = true;
            }
        }while (!nameAccepted);

        return nomPersona;
    }

    /**
     * Imprimeix per pantalla una salutació personalitzada
     * @param nom
     */
    private static void ferSalutacio(String nom) {
        System.out.println("Hola " + nom);
    }
}

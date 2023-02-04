import java.util.Scanner;

public class TA02_Correccio_ParellSenar {
    /**
     * Mètode main principal
     * @param args
     */
    public static void main(String[] args) {
        final String MENU_PRINCIPAL = "Escull una opció: "
                + "\n\t1. Comprovar parrel | senar"
                + "\n\t2. Sortir i que no me sal Piqué";

        System.out.println("Benvingut/da al programa");

        int opcio = 0;

        do {
            opcio = llegirInt(MENU_PRINCIPAL);
            switch (opcio) {
                case 1:
                    int numero = llegirInt("Escriu un número");
                    if (comprovarParell(numero)){
                        System.out.println("El valor és parell");
                    }else {
                        System.out.println("El valor és senar");
                    }
                    break;
                case 2:
                    System.out.println("Adiós bebe...");
                    break;
                default:
                    System.out.println("Clara mente no és buena persona");
                    break;
            }
        }while (opcio != 2);
    }

    /**
     * Mètode que retorna un número del 0-1 per retornar un true o false
     * @param numero de tipus int
     * @return numero de tipus boolean
     */
    public static boolean comprovarParell(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Mètode per llegir amb un control d'errors un valor int
     * @param menuPrincipal de tipus String
     * @return valorLlegit de tipus int
     */
    public static int llegirInt(String menuPrincipal) {
        Scanner llegir = new Scanner(System.in);

        int valorLlegit = 0;
        boolean tipusCorrecte;

        do {
            System.out.println(menuPrincipal);
            tipusCorrecte = llegir.hasNextInt();

            if (!tipusCorrecte) {
                System.out.println("ERROR: Tipus de dades no acceptat");
            } else {
                valorLlegit = llegir.nextInt();
            }
        }while(!tipusCorrecte);

        return valorLlegit;
    }
}
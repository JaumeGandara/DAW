/*
5. El preu d’una Volkswagen Grand California és de 73490€, com que és una gran
inversió, en volem calcular el valor de mercat per si un dia la volem vendre de segona
mà. Sabem que perd un 0.00001% de valor pera cada quilòmetre que recorre.
Extra: Si la Volkswagen és la versió Camper Full Equip val 20000€ més. Modifica el
teu algoritme per tal de que permeti fer el càlcul amb les dues opcions.
Dades: PREU_BASE, FULL_EQUIP, PERDUA_VALOR_KM, kms, valorActual, esFE;
*/
import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int PREU_BASE = 73490;
        final float FULL_EQUIP = 20000.0f;
        final float PERDUA_VALOR_KM = 0.00001f;

        int kms;
        float valorActual;
        boolean esFE;

        System.out.println("Benvingut/da al programa...");
        System.out.println("La teva camper és Full Equip) (true | false)");
        esFE = input.nextBoolean();

        if (esFE){
            valorActual = PREU_BASE + FULL_EQUIP;
        }else {
            valorActual = PREU_BASE;
        }

        do {
            System.out.println("Escriu els kms que has gaudit amb la furgo...");
            kms = input.nextInt();
        }while (kms < 0);

        valorActual = valorActual - (kms * PERDUA_VALOR_KM * valorActual);
        System.out.printf("El valor actual de la furgo és: %.2f€", valorActual);

    }
}
/*
3. Escriu un programa per obtenir una cadena formada pels primers 2 i els
darrers 2 caràcters d'una cadena donada. Si la longitud de la cadena és inferior
a 2, torneu una cadena buida.
    Cadena de mostra: "w3resource"
    Resultat esperat: 'w3ce'
    Cadena de mostra: "w3"
    Resultat esperat: 'w3w3'
    Cadena de mostra: "w"
    Resultat esperat: cadena buida
 */

import java.util.Scanner;

public class GàndaraJaume_StringsE_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena;

        System.out.println("Escriu qualsevol cosa");

        cadena = input.nextLine();

        if (cadena.length() <= 1){
            System.out.println("cadena buida");
        }else {
            System.out.println(cadena.substring(0,2) + cadena.substring(cadena.length()-2));
        }
    }
}

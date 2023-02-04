/*
4. Escriviu un programa per afegir 'ing' al final d'una cadena determinada (la
longitud ha de ser com a mínim 3). Si la cadena donada ja acaba amb 'ing',
afegiu 'ly' al seu lloc. Si la longitud de la cadena donada és inferior a 3, deixeu-la
sense canvis.
    Cadena de mostra: "abc"
    Resultat esperat: "abcing"
    Cadena de mostra: "string"
    Resultat esperat: "stringly"
 */

import java.util.Scanner;

public class GàndaraJaume_StringsE_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena;

        System.out.println("Escriu qualsevol cosa");

        cadena = input.nextLine();

        if (cadena.length() >= 3){
            if (cadena.substring(cadena.length()-3) != "ing"){
                System.out.println(cadena + "ing");
            }else {
                System.out.println(cadena + "ly");
            }
        }else {
            System.out.println(cadena);
        }
    }
}

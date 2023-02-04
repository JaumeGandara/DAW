import java.util.Scanner;

public class Exemple_3_CasteoVariables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String paraula;

        char lletra = 'a';
        int numero = lletra;
        System.out.println("La lletra val " + lletra);
        System.out.println("El seu codi ascci és " + numero);
        System.out.print("Escriu un numero enter positiu: ");
        numero = input.nextInt();

        lletra = (char)numero;
        System.out.println("El caràcter amb el valor " + numero + " és " + lletra);

        System.out.print("Escriu un caracter: ");
        paraula = input.next();

        lletra = paraula.charAt(0);

        numero = lletra;

        System.out.println("El codi equivalent a la lletra " + lletra + "és " + numero);

    }
}

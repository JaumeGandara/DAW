/*
4. El Departament d’Ensenyament de la Generalitat vol saber el percentatge nois i noies
que hi ha a les aules. Dissenya un algoritme que pregunti quantes noies i nois hi ha a
l’aula i aleshores en mostri els percentatges.
Dades: numNois, numNoies, totalAlumnes, percNois, percNoies
*/
import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final String BLUE = "\033[34m";
        final String PURPLE = "\033[35m";
        final String RESET = "\u001B[0m";

        int numNois;
        int numNoies;
        int totalAlumnes;
        float percNois;
        float percNoies;

        do {
            System.out.println("Benvingut/da a l'aplicació");
            System.out.print("Escriu el numero de nois: ");
            numNois = input.nextInt();

            System.out.print("Escriu el numero de noies: ");
            numNoies = input.nextInt();
        }while (numNois < 0 || numNoies < 0);

        if (numNois == 0 && numNoies == 0){
            System.out.println("ERROR: Valors d'entrada incorrectes...");
        }else {
            totalAlumnes = numNois + numNoies;
            percNois = ((float) numNois / (float) totalAlumnes) * 100.0f;
            percNoies = ((float) numNoies / (float) totalAlumnes) * 100.0f;
            System.out.printf("El percentatge de nois és del " + BLUE + "%.2f%%" + RESET + " i el de noies és del " + PURPLE + "%.2f%%" + RESET, percNois, percNoies);
        }
    }
}
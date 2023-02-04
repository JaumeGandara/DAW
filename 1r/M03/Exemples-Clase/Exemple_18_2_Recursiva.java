import java.util.Scanner;

public class Exemple_18_2_Recursiva {
    /**
     * Mètode main
     * @param args
     */
    public static void main(String[] args) {
        menuPrincipal(inputIntMinMax("Escull l'opció: 1/2/3/4(sortir)\n > ","ERROR: Tipatge incorrecte",1,4,"ERROR: Valor fora de rang"));
    }

    /**
     * Mètode del menú principal
     */
    private static void menuPrincipal(int opcio){
        switch (opcio){
            case 1:
                System.out.println("Cas 1");
                menuPrincipal(inputIntMinMax("Escull l'opció: 1/2/3/4(sortir)\n > ","ERROR: Tipatge incorrecte",1,4,"ERROR: Valor fora de rang"));
            case 2:
                System.out.println("Cas 2");
                menuPrincipal(inputIntMinMax("Escull l'opció: 1/2/3/4(sortir)\n > ","ERROR: Tipatge incorrecte",1,4,"ERROR: Valor fora de rang"));
            case 3:
                System.out.println("Cas 3");
                menuPrincipal(inputIntMinMax("Escull l'opció: 1/2/3/4(sortir)\n > ","ERROR: Tipatge incorrecte",1,4,"ERROR: Valor fora de rang"));
            case 4:
                System.out.println("Adeu...");
                break;
        }
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus int
     * @param max de tipus int
     * @param error2 de tipus String
     * @return value de tipus int
     */
    public static int inputIntMinMax(String text, String error1,int min, int max, String error2){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextInt();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}

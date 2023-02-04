import java.util.Scanner;

public class Exemple_18_4_RecursivaFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(inputInt("Escriu un valor enter: ","ERROR: Tipatge incorrecte")));
    }

    private static int factorial(int n){
        int resultat;

        if (n==0){
            resultat = 1;
        }else {
            resultat = n*factorial(n-1);
        }

        return resultat;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus int
     */
    public static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}

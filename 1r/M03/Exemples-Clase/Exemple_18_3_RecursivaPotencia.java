import java.util.Scanner;

public class Exemple_18_3_RecursivaPotencia {
    public static void main(String[] args) {
        System.out.println(potencia(inputInt("Escriu un valor enter: ","ERROR: Tipatge incorrecte"),inputInt("Escriu un valor enter: ","ERROR: Tipatge incorrecte")));
    }

    private static int potencia(int x, int n){
        if (n==0){
            return 1;
        }else {
            return x * potencia(x, n-1);
        }
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

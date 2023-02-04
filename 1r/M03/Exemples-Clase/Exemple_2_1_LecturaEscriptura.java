import java.util.Scanner;

public class Exemple_2_1_LecturaEscriptura {
    public static void main(String[] args) {

        // Declarem i inicialitzem la variable input
        Scanner input = new Scanner(System.in);

        final String ESPAI = " ";

        System.out.print("Escriu un número enter:" + ESPAI);
        int x = input.nextInt();

        System.out.println("Has triat el valor" + ESPAI + x);

        System.out.print("Escriu un altre enter:" + ESPAI);
        int y = input.nextInt();

        System.out.println("Has triat el valor" + ESPAI + y);
        System.out.println("Has triat els valors" + ESPAI + x + ESPAI + "i" + ESPAI + y );

    }
}

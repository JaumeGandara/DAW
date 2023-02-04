import java.util.Scanner;

public class Exemple_4_Colors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String BLACK = "\033[30m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String PURPLE = "\033[35m";
        final String CYAN = "\033[36m";
        final String WHITE = "\033[37m";
        final String RESET = "\u001B[0m";

        float costInicial, preuVenda;
        boolean bonEstat;

        System.out.println("Benvingut/da al programa...");
        System.out.print("Escriu l'import de la compra actual: ");
        costInicial = input.nextFloat();

        System.out.println("Està en bon estat? (true | false)");
        bonEstat = input.nextBoolean();

        if (bonEstat){
            // TODO: Esborrar el pepe
            System.out.println("pepe");
            preuVenda = costInicial * 1.25f;
        } else{
            // TODO: Esborrar la pepa
            System.out.println("pepa");
            preuVenda = costInicial * 1.10f;
        }

        System.out.println("El preu de venda és: " + preuVenda + "€");

        System.out.println(RED+"Hello World!"+RESET);
        System.out.println(GREEN+"Goodbye!"+RESET);

    }
}

import java.util.Scanner;

public class Exemple_5_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char opcio;
        String text;

        do {
            System.out.println("Escull una opció"
                    + "\n\ta) Hola"
                    + "\n\tb) Adéu"
                    + "\n\tc) Error"
                    + "\n\td) Sortir");
            text = input.next();
            opcio = text.charAt(0);

            switch (opcio){
                case 'a':
                    System.out.println("Hola");
                    break;
                case 'b':
                    System.out.println("Adéu");
                    break;
                case 'c':
                    System.out.println("Error");
                    break;
                case 'd':
                    System.out.println("Sortint de l'aplicació...");
                    break;
                default:
                    System.out.println("Valor no correcte");
                    break;
            }
        }while (opcio != 'd');
    }
}

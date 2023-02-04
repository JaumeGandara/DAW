import java.util.Scanner;

public class Exemple_2_2_LecturaEscriptura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Escriu el teu nom: ");
        String name = input.nextLine();

        System.out.println("Hola " + name);

    }
}

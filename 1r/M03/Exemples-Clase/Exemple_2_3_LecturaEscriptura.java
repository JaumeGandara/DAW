import java.util.Scanner;

public class Exemple_2_3_LecturaEscriptura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final String ESPAI = " ";

        System.out.print("Escriu el teu nom: ");
        String name = input.next();

        System.out.print("Escriu el teu primer cognom: ");
        String firstSurname = input.next();

        System.out.print("Escriu el teu segon cognom: ");
        String secondSurname = input.next();

        System.out.println("Hola " + name + ESPAI + firstSurname + ESPAI + secondSurname);

    }
}

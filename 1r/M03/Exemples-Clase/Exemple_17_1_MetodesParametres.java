import java.util.Scanner;

public class Exemple_17_1_MetodesParametres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre;

        System.out.print("Escribe tu nombre hijo del Sol: ");
        nombre = leer.nextLine();
        salutacion(nombre);
    }

    /**
     * Mètode que saluda a la persona pel seu nom
     * @param n de tipus String
     */
    public static void salutacion(String n) {
        System.out.println("Hola " + n + " hijo menor de Númenor del Sol y la Luna");
    }
}
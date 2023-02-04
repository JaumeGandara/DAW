import java.util.Scanner;

public class Exemple_14_1_publicClass {
    public static void main(String[] args) {

    }

    public static void searchInt(int[] numeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriu el valor a buscar: ");
        int valorSearch = input.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (valorSearch == numeros[i]){

            }
        }
    }
}

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 10;

        Scanner input = new Scanner(System.in);

        float userValor;

        boolean correctValor;

        do {
            System.out.print("Introdueix un valor enter entre " + MIN + " i " + MAX + ": ");
            correctValor = input.hasNextFloat();

            if (!correctValor){
                System.out.println("ERROR: No has escrit numero");
                input.nextLine();
            }else {
                userValor = input.nextFloat();

                if (userValor < MIN || userValor > MAX){
                    System.out.println("WARNING: No has escrit un valor entre " + MIN + " i " + MAX);
                    correctValor = false;
                    input.nextLine();
                }else{
                    System.out.printf("Ben fet has escrit el valor " + userValor);
                    input.nextLine();
                }
            }
        }while (!correctValor);
    }
}
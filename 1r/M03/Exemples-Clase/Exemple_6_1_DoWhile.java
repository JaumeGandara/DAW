import java.util.Scanner;

public class Exemple_6_1_DoWhile {
    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 10;

        Scanner input = new Scanner(System.in);

        int valorUsuari;
        int valorCPU;

        boolean tipatgeCorrecte = false;

        do {
            System.out.println("Introdueix un valor enter entre " + MIN + " i " + MAX);
            tipatgeCorrecte = input.hasNextInt();

            if (tipatgeCorrecte == false){
                System.out.println("ERROR: No has escrit un enter");
                input.nextLine();//Esborra el contingut del Scanner
            }else {
                valorUsuari = input.nextInt();

                if (valorUsuari < MIN || valorUsuari > MAX){
                    System.out.println("WARNING: Valor fora de rang!");
                    tipatgeCorrecte = false;
                    input.nextLine();
                }
            }
        }while (tipatgeCorrecte == false);

        /*
        do {
            System.out.print("Introdueix un valor enter entre 1 i 10: ");
            valorUsuari = input.nextInt();
            input.nextLine();
        }while ((valorUsuari < MIN) || (valorUsuari > MAX));

        do {
            valorCPU = (int)(Math.random()*MAX);
        }while (valorCPU < MIN || valorCPU > MAX);

        if (valorCPU == valorUsuari){
            System.out.println("Felicitats!!!");
        }else {
            System.out.println("La CPU ha triat: " + valorCPU + " / tu has triat: " + valorUsuari);
        }
        */
    }
}

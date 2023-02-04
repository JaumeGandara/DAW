import java.util.Scanner;

public class Exemple_8_1_For {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean posposar;

        System.out.println("Benvingut/da al programa...");
        System.out.println("");

        //Repetir 10 vegades

        System.out.println("Repetir 10 vegades");
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("");

        //Repetir 10 vegades però al reves

        System.out.println("Repetir 10 vegades però al reves");
        System.out.println("");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("");

        //Els bytes multiplica'n per 2

        System.out.println("Els bytes multiplica'n per 2");
        System.out.println("");

        for (int i = 2; i <= 2048; i*=2) {
            System.out.println(i);
        }

        System.out.println("");

        //Els bytes divideixen per 2

        System.out.println("Els bytes es divideixen per 2");
        System.out.println("");

        for (int i = 2048; i >= 2; i/=2) {
            System.out.println(i);
        }

        System.out.println("");

        //Exemple despertador

        for (int i = 1; i < 10; i++) {
            System.out.println("BEEP" + i);
            System.out.print("Vols posposar la alarma i arribar tard? ");
            posposar = input.nextBoolean();

            //break: sortiria a fora del for

            if (!posposar){
                break;
            }

            /*
            continue: tornaria a començar el for
            i%2: cada vegada que i sigui multiple de 2 escriurà "Molt bé"
            i tornarà a començar el for i quan no ho sigui no escriurà "Molt bé i tornarà a començà"
             */

            if (i%2 == 0){
                continue;
            }

            System.out.println("Molt bé");
        }

        System.out.println("");

        /*
        i es repetirà 2 vegades
        j es repetirà 10 vegades
        Com "i" es repetirà 2 vegades j es repetirà 20 vegades, ja que farà 2 voltes
        */

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("El valor de i és " + i + " i el valor de j és " + j);
            }
        }
    }
}

import java.util.Scanner;

public class GandaraJaume_Exercici1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcio = 0;

        boolean correctTyping;

        System.out.println("Benvingut/da al programa...");

        do {
            System.out.println("""
                Escull la matriuInt\s
                \t1.- Transformar de Fahrenheit a Celsius.
                \t2.- Transformar de milles a kilometres.
                \t3.- Sortir.""");

            opcio = input.nextInt();

            switch (opcio){
                case 1:
                    float temperaturaF = 0.0f;
                    float temperaturaC = 0.0f;

                    do {
                        System.out.print("Introdueixi la temperatura: ");
                        correctTyping = input.hasNextFloat();

                        if (!correctTyping) {
                            System.out.println("ERROR");
                        } else {
                            temperaturaF = input.nextInt();
                        }
                        input.nextLine();
                    } while (!correctTyping);

                    temperaturaC = temperaturaF - 18.2222f;

                    System.out.println(temperaturaF + " Fahrenheit en Celsius és " + temperaturaC + "C");

                    break;
                case 2:
                    float milla = 0.0f;
                    float kilometre = 0.0f;

                    do {
                        System.out.print("Introdueixi la distancia: ");
                        correctTyping = input.hasNextFloat();

                        if (!correctTyping) {
                            System.out.println("ERROR");
                        } else {
                            milla = input.nextInt();
                        }
                        input.nextLine();
                    } while (!correctTyping);

                    kilometre = milla * 1.6f;

                    System.out.println(milla + " Milles són " + kilometre + "Km");

                    break;
                case 3:
                    System.out.println("Sortint...");
                    break;
                default:
                    break;
            }
        }while (opcio != 3);

    }
}
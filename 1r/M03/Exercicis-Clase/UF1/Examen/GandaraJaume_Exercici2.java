import java.util.Scanner;

public class GandaraJaume_Exercici2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] comprat;
        int[] guanyadors;

        int opcio = 0;
        int premi = 0;

        boolean correctTyping = false;

        System.out.println("Benvingut/da al programa...");

        guanyadors = new int[10];
        comprat = new int[3];

        for (int c = 0; c < 3; c++) {
            System.out.println("""
                    Escull la matriuInt\s
                    \t1.- Comprat butllet.
                    \t2.- Calcular.""");

            opcio = input.nextInt();

            if (opcio == 1) {
                int valor;

                System.out.print("Introdueix el número que vol comprar: ");

                valor = input.nextInt();
                premi = premi - 10;
            } else {
                System.out.println("Calculant...");
            }
        }

        for (int g = 0; g < 9; g++) {
            int valor = (int)(Math.random()*99999);

            guanyadors[g] = valor;

            System.out.println("Butllet guanyador " + (g+1) + " és " + guanyadors[g]);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                if (comprat[j] == guanyadors[i]){
                    premi = premi + 200000;
                }
            }
        }

        System.out.println("Has guanyat " + premi);
    }
}

/*
7. Pensa un algoritme que serveixi per a calcular el sou dels sanitaris. Ens diuen que el
seu salari base és de 1250 €. Afegidament, les hores extra es paguen a part. Si en fan
fins a 5 extra es paguen a 15 € l’hora; si en fa més de 5, se li paguen 15€ l’hora fins a
les primeres 5 hores i 12€ per a cada hora extra de més. Tingues en compte que no
sempre fan hores extra.
Extra: Modifica el teu algoritme per tal de que sumi un plus de risc de +250€ al sou
base i +5€ per a cada hora extra (independentment de quantes en facin) als sanitaris
que estiguin exposats al covid-19.
Dades: SOU_BASE, PLUS_SOU, horesExtra, souBaseTotal, souExtraTotal, souBaseTotal,
       souBaseTotalDos, souBaseTotalDos, souTotal, extraHora, riscCovid;
*/

import java.util.Scanner;

public class exercici7 {
    public static void main(String[] args) {

        final int SOU_BASE = 1250;
        final int PLUS_SOU = 250;

        Scanner input = new Scanner(System.in);

        int horesExtra = 0;
        int souExtra = 0;
        int souBaseTotal = 0;
        int souExtraTotal = 0;
        int souBaseTotalDos = 0;
        int souExtraTotalDos = 0;
        float souTotal = 0;
        boolean extraHora;
        boolean riscCovid;

        System.out.println("Benvingut/da al programa...");

        do {
            System.out.println("Has fet hores extra?");
            extraHora = input.nextBoolean();

            if (extraHora){
                System.out.println("Quantes hores extra has fet?");
                horesExtra = input.nextInt();
            }

            if (horesExtra < 0 || horesExtra > 80){
                System.out.println("Escriu un valor entre el 0 i el 80");
            }
        }while (horesExtra < 0 || horesExtra > 80);

        System.out.println("Estàs exposat al covid?");
        riscCovid = input.nextBoolean();
        System.out.println(horesExtra);

        if (extraHora){
            if (horesExtra <= 5){
                souExtra = horesExtra * 15;
            }else {
                souExtra = (horesExtra - 5) * 12 + 75;
            }
        }

        if (riscCovid){
            souExtraTotal = horesExtra * 5;
            souBaseTotal = 250;
        }

        souBaseTotalDos = souBaseTotal + SOU_BASE;
        souExtraTotalDos = souExtraTotal + souExtra;
        souTotal = souBaseTotalDos + souExtraTotalDos;

        System.out.printf("El sou total és: %.2f€", souTotal);

    }
}
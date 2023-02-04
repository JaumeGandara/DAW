import java.util.Scanner;

public class Exemple_13_1_ArrayHorariEscolar {
    // Serveix per crear el mètode executable
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        final String BLACK = "\033[40m";
        final String RED = "\033[41m";
        final String GREEN = "\033[42m";
        final String YELLOW = "\033[43m";
        final String BLUE = "\033[44m";
        final String PURPLE = "\033[45m";
        final String CYAN = "\033[46m";
        final String GREY = "\033[47m";
        final String RESET = "\u001B[0m";

        final String[] dia = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};
        final String[] torn = {"Matí", "Tarda"};
        int opcio;

        boolean valorCorrecte;

        String[][] horari = new String[2][5];

        horari[0][0] = RED+"Mates";
        horari[0][1] = RESET+"Català";
        horari[0][2] = GREY+"Castellà";
        horari[0][3] = YELLOW+"Anglès";
        horari[0][4] = GREEN+"Ed. Física"+RESET;
        horari[1][0] = BLUE+"Socials";
        horari[1][1] = GREEN+"Naturals";
        horari[1][2] = BLACK+"Tecno";
        horari[1][3] = PURPLE+"Ed. Plàstica"+RESET;
        horari[1][4] = RESET+"";

        System.out.print("\t");
        for (int i = 0; i < dia.length; i++) {
            System.out.print(GREY+"\t"+dia[i]+" ");
        }

        System.out.println(RESET+"");

        for (int fila = 0; fila < horari.length; fila++) {
            System.out.print(BLUE+torn[fila]+"\t"+RESET);
            for (int col = 0; col < 5; col++) {
                System.out.print("["+horari[fila][col]+"]\t");
            }
            System.out.println("");
        }

        do {
            System.out.println("Quin torn vols veure? (0) Mostra-ho tot (1) Matí (2) Tarda (3) Escull dia a mostrar (4) Sortir");
            //TODO: Control d'errors de tipus de dades (de domini no cal)

            do {
                System.out.print("Escriu un valor:");
                valorCorrecte = llegir.hasNextInt();

                if (!valorCorrecte) {
                    System.out.println("ERROR");
                } else {
                    opcio = llegir.nextInt();
                    if (opcio < 0) {
                        System.out.println("Has d'escriure un nombre positiu!");
                        valorCorrecte = false;
                        llegir.nextLine();
                    }
                }
                llegir.nextLine();
            } while (!valorCorrecte);

            opcio = llegir.nextInt();
            llegir.nextLine();

            switch (opcio) {
                case 0:
                    //TODO: Fer que mostri tot l'horari
                    break;
                case 1:
                    System.out.println("Has escollit matí");
                    for (int i = 0; i < horari[0].length; i++) {
                        System.out.print(horari[0][i] + "\t");
                    }
                    break;
                case 2:
                    System.out.println("Has escollit tarda");
                    for (int i = 0; i < horari[1].length; i++) {
                        System.out.print(horari[1][i] + "\t");
                    }
                    break;
                case 3:
                    //TODO: Desenvolupar submenú per escollir dia concret i mostrar-lo
                    String diaEscollit = "";
                    System.out.println(GREY+"\tQuin dia de la setmana vols veure?"+RESET);
                    System.out.println(GREY+"\t\tDilluns, Dimarts, Dimecres, Dijous, Divendres"+RESET);
                    diaEscollit = llegir.nextLine();
                    System.out.println(diaEscollit);
                    break;
                case 4:
                    System.out.println("Adéu");
                    break;
                default:
                    System.out.println("WARNING: Opció no vàlida");
                    break;
            }
        }while(opcio != 4);

        //TODO: EXTRA: Donar la possibilitat a l'usuari de canviar els valors de l'horari
        //TODO: EXTRA: Buscar la manera de mostrar la matriu bonica usant Sytem.out.printf o System.out.format

    }
}
import java.util.Scanner;

public class Exemple_12_3_ArrayHorariEscolar {
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
    }
}

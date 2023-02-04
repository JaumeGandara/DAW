public class Exemple_12_2_ArrayHorariEscolar {
    public static void main(String[] args) {
        /*
        Si en els color, en comptes d'escriure 30 escrius 40 es pintarà el fons i no les lletres
         */

        final String BLACK = "\033[40m";
        final String RED = "\033[41m";
        final String GREEN = "\033[42m";
        final String YELLOW = "\033[43m";
        final String BLUE = "\033[44m";
        final String PURPLE = "\033[45m";
        final String CYAN = "\033[46m";
        final String WHITE = "\033[47m";
        final String RESET = "\u001B[0m";

        /*
        String[][] horari = new String[3][6];

        horari[0][0] = "-----";
        horari[0][1] = "Dilluns";
        horari[0][2] = "Dimarts";
        horari[0][3] = "Dimecres";
        horari[0][4] = "Dijous";
        horari[0][5] = "Divendres";

        horari[1][0] = "Matí";
        horari[1][1] = "Mates";
        horari[1][2] = "Català";
        horari[1][3] = "Castellà";
        horari[1][4] = "Anglès";
        horari[0][5] = "Ed. Física";

        horari[2][0] = "Tarda";
        horari[2][1] = "Socials";
        horari[2][2] = "Naturals";
        horari[2][3] = "Tecnologia";
        horari[2][4] = "Ed. Plàstica";
        horari[2][5] = "-----";
        */

        String[][] horari = {
                {"-----","Dilluns","Dimarts","Dimecres","Dijous","Divendres"},
                {"Matí","Mates","Català","Castellà","Anglès","Ed. Física"},
                {"Tarda","Socials","Naturals","Tecnologia","Ed. Plàstica","-----"}
        };

        for (int fila = 0; fila < horari.length; fila++) {
            for (int col = 0; col < 6; col++) {
                System.out.print(horari[fila][col] + " ; ");
            }
            System.out.println("");
        }
    }
}

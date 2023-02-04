import java.util.Scanner;

public class AC03_Maquina_de_bitllets {
    /**
     * Mètode main per inicialitzar el programa
     * @param args
     */
    public static void main(String[] args) {
        final float[] MONEDES_ACCEPTADES = {0.01f,0.02f,0.05f,0.10f,0.20f,0.50f,1.0f,2.0f,5.0f,10.0f,20.0f,50.f,100.0f,200.0f};
        final float[] PREU_TIQUETS = {2.40f,11.35f,40.0f,10.0f,80.0f};
        final String[] TIQUETS = {"Bitllet senzill","TCasual","TUsual","TFamiliar","TJove"};

        int opcio;
        int opcioZona;
        int numTiquets = 0;

        boolean seguirComprant = true;

        String[][] tiquetsEscollits = new String[3][3];

        do {
            System.out.println("-------------------------------------------------");
            do {
                boolean tipusMenu = true;

                opcio = inputInt(tipusMenu,TIQUETS,"ERROR: Introdueixi un número");

                switch (opcio){
                    case 1:
                        opcioZona = inputInt(false,TIQUETS,"ERROR: Introdueixi un número");
                        tiquetsEscollits[numTiquets][0] = TIQUETS[opcio-1];
                        tiquetsEscollits[numTiquets][1] = "Zona " + opcioZona;
                        switch (opcioZona){
                            case 1:
                                tiquetsEscollits[numTiquets][2] = String.valueOf(PREU_TIQUETS[opcio-1]);
                                break;
                            case 2:
                                tiquetsEscollits[numTiquets][2] = String.valueOf((PREU_TIQUETS[opcio-1]*1.3125));
                                break;
                            case 3:
                                tiquetsEscollits[numTiquets][2] = String.valueOf((PREU_TIQUETS[opcio-1]*1.8443));
                                break;
                        }

                        seguirComprant = informa(tiquetsEscollits, numTiquets);

                        numTiquets++;
                        break;
                    case 2:
                        /* TODO: Acabar opció 2*/
                        break;
                    case 3:
                        /* TODO: Acabar opció 2*/
                        break;
                    case 4:
                        /* TODO: Acabar opció 2*/
                        break;
                    case 5:
                        /* TODO: Acabar opció 2*/
                        break;
                    case 4321:
                        System.out.println("Número secret correcte"+"\nAturant màquina...");
                        break;
                    default:
                        break;
                }
            }while (opcio != 4321 || numTiquets > 3 || !seguirComprant);
            /* TODO: Acabar rebut*/
        }while(opcio != 4321);
    }

    /**
     * Mètode per llegir variables int amb control d'errors de tipatge
     * @param error
     * @return
     */
    private static int inputInt(boolean tipusMenu,String[] tiquets,String error) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctTyping;

        do {
            if (tipusMenu){
                menuPrincipal(tiquets);
            }else {
                zona();
            }
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                x = input.nextInt();
            }
            input.nextLine();
        }while(!correctTyping);

        return x;
    }

    /**
     * Mètode que ensenya el menú principal
     * @param tiquets de tipus String[]
     */
    private static void menuPrincipal(String []tiquets) {
        System.out.println("Quin bitllet desitja obtenir?");

        for (int i = 0; i < tiquets.length; i++) {
            System.out.println("\t"+ (i+1) + " - " + tiquets[i]);
        }
    }

    /**
     *
     * @return
     */
    private static void zona() {
        System.out.print("Introdueixi la zona a la que vol viatjar: ");
    }

    private static boolean informa(String[][] tiquetsEscollits, int numTiquets) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ha escollit l'opció: " + tiquetsEscollits[numTiquets][0] + ", " + tiquetsEscollits[numTiquets][1] +
                "\n El preu del bitllet és " + tiquetsEscollits[numTiquets][2] + "€");

        String x;
        boolean y = false;

        /* TODO: Arreglar seguir comprant*/
        do {
            System.out.println("Vol seguir comprant? [S,N]");
            x = input.next();
            if (x == "s"){
                y = true;
            }else if (x == "n"){
                y = false;
            }
        }while(x != "s" || x != "n");

        return y;
    }
}
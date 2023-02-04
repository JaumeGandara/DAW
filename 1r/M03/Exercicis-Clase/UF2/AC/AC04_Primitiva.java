import java.util.Scanner;

/**
 * Programa de simulació de La Primitiva
 * @author Jaume Gàndara
 * @version 1.1
 * @date 26/01/2023
 */
public class AC04_Primitiva {
    /**
     * Mètode main executable
     * @param args
     * @since 1.0
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    /**
     * Mètode amb el menú principal
     * @since 1.1
     */
    private static void menuPrincipal(){
        int[] combinacioGuanyadora;
        int[] aposta = new int[0];
        int premi;
        int opcio = 0;

        do {
            System.out.println("***** PRIMITIVA ******");

            opcio = llegirInt("1. Fer aposta\n" +
                    "2. Girar el bombo\n" +
                    "3. Joc nou\n" +
                    "4. Sortir\n" +
                    "> ",1,4);

            switch (opcio){
                case 1:
                    aposta = introduirAposta();
                    break;
                case 2:
                    combinacioGuanyadora = calcularCombinacioGuanyadora();

                    if (combinacioGuanyadora != null) {
                        System.out.println("La combinació guanyadora és: ");

                        for (int i = 0; i < combinacioGuanyadora.length; i++) {
                            System.out.print(combinacioGuanyadora[i] + " ");
                        }

                        System.out.println("Reintegrament " + combinacioGuanyadora[combinacioGuanyadora.length - 1]);
                    }

                    premi = comprovarEncerts(aposta,combinacioGuanyadora);
                    System.out.println("El teu premi és: "+premi+" €");
                    break;
                case 3:
                    System.out.println("Comença'n joc nou...");
                    aposta = new int[0];
                    combinacioGuanyadora = new int[0];
                    break;
                case 4:
                    System.out.println("Sortint...");
                    break;
            }
        }while(opcio != 4);
    }

    /**
     * Aquest mètode demàna a l'usuari que introdueixi la combinació que ell vulgui
     * @return aposta de tipus int[] que és la combinació que ha escollit l'usuari
     * @since 1.1
     */
    private static int[] introduirAposta(){
        int[] aposta = new int[7];
        int valor;
        boolean repetit = false;

            for (int i = 0; i < aposta.length-1; i++) {
                do {
                    valor = llegirInt("Introdueix el valor " + (i+1) + " del 1-49 de la combinació de l'aposta: ",1,49);

                    for (int j = 0; j < aposta.length-1; j++) {
                        if (valor == aposta[j]){
                            if (i != j){
                                System.out.println("ERROR: Número repetit");
                                repetit = true;
                                break;
                            }else {
                                repetit = false;
                                aposta[j] = valor;
                            }
                        }else {
                            repetit = false;
                            aposta[j] = valor;
                        }
                    }
                }while(repetit);
            }
            aposta[6] = llegirInt("Introdueix el valor 7 del 0-9 del reintegra: ",0,9);

        return aposta;
    }

    /**
     * Aquest mètode crea la combinació guanyadora
     * @return combinacio de tipus int[] que conté la combinació guanyadora
     * @since 1.1
     */
    private static int[] calcularCombinacioGuanyadora(){
        int[] combinacio = new int[7];
        int valor;
        boolean repetit = false;

        for (int i = 0; i < combinacio.length-1; i++) {
            do {
                valor = (int) ((Math.random()*49)+1);

                for (int j = 0; j < combinacio.length-1; j++) {
                    if (valor == combinacio[j]){
                        if (i != j){
                            repetit = true;
                            break;
                        }else {
                            repetit = false;
                            combinacio[i] = valor;
                        }
                    }else {
                        repetit = false;
                        combinacio[i] = valor;
                    }
                }
            }while(repetit);
        }

        combinacio[6] = (int) ((Math.random()*9)+0);

        return combinacio;
    }

    /**
     * Aquest mètode comprova els encerts
     * @param aposta de tipus int[], que és la combinació escollida per l'usuari
     * @param combinacioGuanyadora de tipus int[], que és la combinació guanyadora
     * @return premi de tipus int, que són els diners que has guanyat o perdut amb la combinació
     * @since 1.1
     */
    private static int comprovarEncerts(int[] aposta, int[] combinacioGuanyadora){
        int premi = 0;

        for (int i = 0; i < combinacioGuanyadora.length-1; i++) {
            if (aposta[i] == combinacioGuanyadora[i]){
                premi = premi + 20;
            }

        }

        if (aposta[6] == combinacioGuanyadora[6]){
            premi = premi + 6;
        }else {
            premi = premi - 6;
        }

        return premi;
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param missatge parametritzat per a mostrar a l'usuari@
     * @param min valor min acceptat
     * @param max valor max acceptat
     * @return retorna un int
     * @since 1.1
     */
    private static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("ERROR: Valor fora de rang");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Aquest mètode serveix per capturar floats des de teclat amb control d'errors
     * @param missatge
     * @return
     * @since 1.0
     */
    private static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);
        float x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
            }else{
                x = llegir.nextFloat();
            }
            llegir.nextLine();
        }while(!valorCorrecte);

        return x;
    }

}

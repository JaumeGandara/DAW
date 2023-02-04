import java.util.Scanner;

public class AC01_Calculadora {
    /**
     * Mètode main per començar l'execució del programa
     * @param args
     */
    public static void main(String[] args) {
        float valor1, valor2, resultat;
        final String MISSATGE_2 = "Escriu el segon valor: ";
        final String MENU_PRINCIPAL = "Les opcions del menú són:\n1- Suma\n2- Resta\n3- Multplicació\n4- Divisió\n5- Exponencial\n6- Sortir";
        int opcioMenu = 0;

        System.out.println("Benvingut al programa de calculadora.");

        do {

            valor1 = llegirFloat("Escriu el primer valor:  ");
            valor2 = llegirFloat(MISSATGE_2);
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 6);
            switch (opcioMenu) {
                case 1:
                    resultat = suma(valor1, valor2);
                    System.out.println("El resultat de la suma és: " + resultat);
                    break;
                case 2:
                    resultat = resta(valor1, valor2);
                    System.out.println("El resultat de la resta és: " + resultat);
                    break;
                case 3:
                    resultat = multiplicacio(valor1, valor2);
                    System.out.println("El resultat de la multiplicació és: " + resultat);
                    break;
                case 4:
                    resultat = divisio(valor1, valor2);
                    System.out.println("El resultat de la divisió és: " + resultat);
                    break;
                case 5:
                    resultat = exponencial(valor1, valor2);
                    System.out.println("El resultat de la exponencial és: " + resultat);
                    break;
                case 6:
                    System.out.println("Sortint... ");
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        }while(opcioMenu != 6);

    }

    /**
     * Mètode que llegeix una variable int pel teclat amb control d'errors i amb màxims i mínims
     * @param missatge de tipus String
     * @param min de tipus int
     * @param max de tipus int
     * @return x de tipus int
     */
    public static int llegirEnter(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Mètode que llegeix una variable float pel teclat amb control d'errors
     * @param missatge de tipus String
     * @return x de tipus float
     */
    public static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
                llegir.nextLine();
            }else{
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        }while(!valorCorrecte);

        return x;
    }

    /**
     * suma
     * @param x de tipus float
     * @param y de tipus float
     * @return suma de tipus float
     */
    public static float suma (float x, float y){
        float suma = x + y;
        return suma;
    }

    /**
     * resta
     * @param x de tipus float
     * @param y de tipus float
     * @return resta de tipus float
     */
    public static float resta (float x, float y){
        float resta = x - y;
        return resta;
    }

    /**
     * multiplicacio
     * @param x de tipus float
     * @param y de tipus float
     * @return multiplicacio de tipus float
     */
    public static float multiplicacio (float x, float y){
        float multiplicacio = x * y;
        return multiplicacio;
    }

    /**
     * divisio
     * @param x de tipus float
     * @param y de tipus float
     * @return divisio de tipus float
     */
    public static float divisio (float x, float y){
        float divisio = x / y;
        return divisio;
    }

    /**
     * Exponencial
     * @param x de tipus float
     * @param y de tipus float
     * @return exponencial de tipus float
     */
    public static float exponencial (float x, float y){
        float exponencial = (float) Math.pow(x, y);
        return exponencial;
    }
}
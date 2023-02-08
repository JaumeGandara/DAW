/*
Exercici 1
Crea una aplicació amb java usant programació modular que permeti a l'usuari introduïr les notes de l'examen de M04-UF1.
Una nota per cada alumne Usarem vectors dinàmics que ens permetin la flexibilitat d'introduïr el nombre de notes que volguem.
Usarem un ArrayList de tipus Float.
Seva declaració és: ArrayList<Float> notesAlumnes = new ArrayList<>();
Per saber la longitud en cada moment de l'ArrayList, usarem ArrayList.size() L'aplicació ha de tenir un menú principal
amb control d'errors (que podeu copiar d'algun altre projecte) i ha de permetre les següents opcions:

Introduïr nota al final del llistat ArrayList.add()
Consultar la nota d'un índex ArrayList.get()
Eliminar una nota en un índex ArrayList.remove()
Modificar la nota en un índex ArrayList.set()
Sortir

Extra : Crear un altre ArrayList de tipus que permeti guardar el nom dels alumnes i així poder saber a qui correspon cada nota.
 */

import java.util.Scanner;

public class IntroduirNomNota {
    /**
     * Mètode main que crida a la resta de mètodes
     * @param args
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal(){
        java.util.ArrayList<Float> notesAlumnes = new java.util.ArrayList<>();
        java.util.ArrayList<String> nomsAlumnes = new java.util.ArrayList<>();

        int opcio;
        do {
            opcio = inputIntMinMax("Introdueixi una opcio:" +
                "\n\t1.- Introduïr alumne" +
                "\n\t2.- Introduïr nota" +
                "\n\t3.- Modificar nom alumne" +
                "\n\t4.- Modificar nota alumne" +
                "\n\t5.- Eliminar alumne" +
                "\n\t6.- Eliminar nota" +
                "\n\t7.- Consultar nota alumne" +
                "\n\t8.- Sortir","",1,8,"ERROR: Valor fora de rang");

            switch (opcio){
                case 1:
                    omplirNom(nomsAlumnes);
                    break;
                case 2:
                    omplirNota(notesAlumnes);
                    break;
                case 3:
                    modificarNom(nomsAlumnes);
                    break;
                case 4:
                    modificarNota(notesAlumnes);
                    break;
                case 5:
                    eliminarNom(nomsAlumnes);
                    break;
                case 6:
                    eliminarNota(notesAlumnes);
                    break;
                case 7:
                    ensenyarNomNota(nomsAlumnes,notesAlumnes);
                    break;
                default:
                    break;
            }
        }while (opcio == 8);
    }

    /**
     * Mètode per introduir el nom d'un alumne en específic
     * @param nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     * @return nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     */
    private static java.util.ArrayList<String> omplirNom(java.util.ArrayList<String> nomsAlumnes){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Introduir nom-----");

        int numAlumne = inputIntMinMax("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte",0,Integer.MAX_VALUE,"ERROR: Valor fora de rang");

        System.out.print("Introdueixi el nom de l'alumne: ");
        nomsAlumnes.add(numAlumne,input.next());

        return nomsAlumnes;
    }

    /**
     * Mètode per introduir la nota d'un alumne en específic
     * @param notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     * @return notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     */
    private static java.util.ArrayList<Float> omplirNota(java.util.ArrayList<Float> notesAlumnes){
        System.out.println("-----Introduir nota-----");

        int numAlumne = inputIntMinMax("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte",0,Integer.MAX_VALUE,"ERROR: Valor fora de rang");
        notesAlumnes.add(numAlumne,inputFloatMinMax("Introdueixi la nota de l'alumne: ","ERROR: Tipatge incorrecte",1,10,"ERROR: Valor fora de rang"));

        return notesAlumnes;
    }

    /**
     * Mètode per modificar el nom d'un alumne en específic
     * @param nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     * @return nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     */
    private static java.util.ArrayList<String> modificarNom(java.util.ArrayList<String> nomsAlumnes){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Modificar nom-----");

        int numAlumne = inputIntMinMax("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte",0,Integer.MAX_VALUE,"ERROR: Valor fora de rang");

        System.out.print("Introdueixi el nom de l'alumne: ");
        nomsAlumnes.set(numAlumne,input.next());

        return nomsAlumnes;
    }

    /**
     * Mètode per modificar la nota d'un alumne en específic
     * @param notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     * @return notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     */
    private static java.util.ArrayList<Float> modificarNota(java.util.ArrayList<Float> notesAlumnes){
        System.out.println("-----Modificar nota-----");

        int numAlumne = inputIntMinMax("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte",0,Integer.MAX_VALUE,"ERROR: Valor fora de rang");
        notesAlumnes.set(numAlumne,inputFloatMinMax("Introdueixi la nota de l'alumne: ","ERROR: Tipatge incorrecte",1,10,"ERROR: Valor fora de rang"));


        return notesAlumnes;
    }

    /**
     * Mètode per eliminar el nom d'un alumne en específic
     * @param nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     * @return nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     */
    private static java.util.ArrayList<String> eliminarNom(java.util.ArrayList<String> nomsAlumnes){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Eliminar nom-----");

        System.out.print(inputInt("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte"));
        nomsAlumnes.remove(input.next());

        return nomsAlumnes;
    }

    /**
     * Mètode per eliminar la nota d'un alumne en específic
     * @param notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     * @return notesAlumnes de tipus ArrayList<float>, que és la llista de les notes dels alumnes
     */
    private static java.util.ArrayList<Float> eliminarNota(java.util.ArrayList<Float> notesAlumnes){
        System.out.println("-----Eliminar nota-----");

        notesAlumnes.remove(inputInt("Introdueixi el numero d'alumne: ","ERROR: Tipatge incorrecte"));


        return notesAlumnes;
    }

    /**
     * Serveix per ensenyar els noms i notes dels alumnes
     * @param nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     * @param notesAlumnes nomsAlumnes de tipus ArrayList<String>, que és la llista dels noms dels alumnes
     */
    private static void ensenyarNomNota(java.util.ArrayList<String> nomsAlumnes, java.util.ArrayList<Float> notesAlumnes){
        for (int i = 0; i < nomsAlumnes.size(); i++) {
            System.out.print(nomsAlumnes.get(i) + ": ");
            System.out.println(notesAlumnes.get(i));
        }
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus int
     * @param max de tipus int
     * @param error2 de tipus String
     * @return value de tipus int
     */
    public static int inputIntMinMax(String text, String error1,int min, int max, String error2){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextInt();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus float
     * @param max de tipus float
     * @param error2 de tipus String
     * @return value de tipus float
     */
    public static float inputFloatMinMax(String text, String error1,float min, float max, String error2){
        Scanner input = new Scanner(System.in);

        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextFloat();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus int
     */
    public static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
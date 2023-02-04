import java.util.Scanner;

public class ParaulaEncriptada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] nom;
        char[][] matriu;
        int[][] matriu2;

        final String RED = "\033[31m";
        final String RESET = "\u001B[0m";

        String nomMajuscules;

        System.out.println("Benvingut/da a l'aplicació");
        System.out.print("Escriu el teu nom en majúscules: ");

        nomMajuscules = input.next();

        System.out.println("");

        nom = nomMajuscules.toCharArray();
        matriu = new char[nom.length][nom.length];
        matriu2 = new int[matriu.length][matriu.length];

        for (int f = 0; f < nom.length; f++) {
            for (int c = 0; c < nom.length; c++) {
                if (f == c){
                    matriu[f][c] = nom[c];
                }else {
                    if (f == 0){
                        matriu[f][c] = (char) (c+96);
                    }else {
                        matriu[f][c] = (char)((Math.random()*(90-65))+65);
                    }
                }
            }
        }

        for (int f = 0; f < nom.length; f++) {
            for (int c = 0; c < nom.length; c++) {
                matriu2[f][c] = matriu[f][c];
            }
        }

        for (int f = 0; f < nom.length; f++) {
            for (int c = 0; c < nom.length; c++) {
                if (f == c){
                    System.out.print(RED + matriu2[f][c] + RESET + "\t");
                }else {
                    System.out.print(matriu2[f][c] + "\t");
                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for (int f = 0; f < nom.length; f++) {
            for (int c = 0; c < nom.length; c++) {
                if (f == c){
                    System.out.print(RED + matriu[f][c] + RESET + "\t");
                }else {
                    System.out.print(matriu[f][c] + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
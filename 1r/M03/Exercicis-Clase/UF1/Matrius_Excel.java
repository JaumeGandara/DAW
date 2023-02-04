import java.util.Scanner;

public class Matrius_Excel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String BLACK_CHAR = "\033[30m";
        final String RED_STRING = "\033[41m";
        final String GREEN_STRING = "\033[42m";
        final String BLUE_STRING = "\033[44m";
        final String RESET = "\u001B[0m";

        int[][] matriuInt;
        String[][] matriuString;
        boolean[][] matriuBoolean;

        int fila = 0;
        int columna = 0;
        int option;

        boolean correctTyping;

        System.out.println("Benvingut/da al programa...");

        do {
            System.out.print("Quantes files vols tenir? (2-30) ");
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println("ERROR");
            } else {
                fila = input.nextInt();
                if (fila < 2 || fila > 30) {
                    System.out.print("Has d'escriure un nombre entre 2 i 30: ");
                    correctTyping = false;
                    input.nextLine();
                }
            }
            input.nextLine();
        } while (!correctTyping);

        do {
            System.out.print("Quantes columnes vols tenir? (2-30) ");
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println("ERROR");
            } else {
                columna = input.nextInt();
                if (columna > 30 || columna < 2) {
                    System.out.print("Has d'escriure un nombre entre 2 i 30: ");
                    correctTyping = false;
                    input.nextLine();
                }
            }
            input.nextLine();
        } while (!correctTyping);

        matriuInt = new int[fila][columna];
        matriuString = new String[fila][columna];
        matriuBoolean = new boolean[fila][columna];

        int midaMatriu = (fila * columna);

        System.out.println("""
                Escull la matriuInt\s
                \t1.- Matriu 1.
                \t2.- Matriu 2.
                \t3.- Matriu 3.
                \t4.- Matriu 4.
                \t5.- Matriu 5.
                \t6.- Matriu 6.
                \t7.- Totes les matrius.
                \t8.- Sortir.""");

        option = input.nextInt();

        switch (option) {
            case 1 -> {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        matriuInt[i][j] = j + 1;
                    }
                }

                System.out.println("\nMatriu 1:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }
            }
            case 2 -> {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i < 1) {
                            matriuInt[i][j] = j + 1;
                        } else {
                            matriuInt[i][j] = (j + 1) + (i * columna);
                        }
                    }
                }

                System.out.println("\nMatriu 2:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }
            }
            case 3 -> {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i == j) {
                            matriuBoolean[i][j] = true;
                        } else {
                            matriuBoolean[i][j] = false;
                        }
                    }
                }

                System.out.println("\nMatriu 3:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i == j) {
                            System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                        }else {
                            System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                        }
                    }
                    System.out.println(" ");
                }
            }
            case 4 -> {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (j % 2 == 0) {
                            matriuString[i][j] = BLUE_STRING + BLACK_CHAR + "\tA\t" + RESET;
                        } else {
                            matriuString[i][j] = RED_STRING + BLACK_CHAR + "\tB\t" + RESET;
                        }
                    }
                }

                System.out.println("\nMatriu 4:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuString[i][j]);
                    }
                    System.out.println(" ");
                }
            }
            case 5 -> {

                //midaMatriu = fila*columna

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        matriuInt[i][j] = midaMatriu;
                        midaMatriu--;
                    }
                }

                System.out.println("\nMatriu 5:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }
            }
            case 6 -> {

                //Jo le feta així:

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                matriuBoolean[i][j] = true;
                            } else {
                                matriuBoolean[i][j] = false;
                            }
                        }else {
                            if (j % 2 == 0) {
                                matriuBoolean[i][j] = false;
                            } else {
                                matriuBoolean[i][j] = true;
                            }
                        }
                    }
                }

                /*
                El profe la feta així:

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if ((fila+columna) % 2 == 0){
                            matriuBoolean[i][j] = true;
                        }
                    }
                }
                 */

                System.out.println("\nMatriu 6:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                            } else {
                                System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                            }
                        } else {
                            if (j % 2 == 0) {
                                System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                            } else {
                                System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                            }
                        }
                    }
                    System.out.println(" ");
                }
            }
            case 7 -> {
                //Matriu 1

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        matriuInt[i][j] = j + 1;
                    }
                }

                System.out.println("\nMatriu 1:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }

                //Matriu 2

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i < 1) {
                            matriuInt[i][j] = j + 1;
                        } else {
                            matriuInt[i][j] = (j + 1) + (i * columna);
                        }
                    }
                }

                System.out.println("\nMatriu 2:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }

                //Matriu 3

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i == j) {
                            matriuBoolean[i][j] = true;
                        } else {
                            matriuBoolean[i][j] = false;
                        }
                    }
                }

                System.out.println("\nMatriu 3:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i == j) {
                            System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                        }else {
                            System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                        }
                    }
                    System.out.println(" ");
                }

                //Matriu 4

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (j % 2 == 0) {
                            matriuString[i][j] = BLUE_STRING + BLACK_CHAR + "\tA\t" + RESET;
                        } else {
                            matriuString[i][j] = RED_STRING + BLACK_CHAR + "\tB\t" + RESET;
                        }
                    }
                }

                System.out.println("\nMatriu 4:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuString[i][j]);
                    }
                    System.out.println(" ");
                }

                //Matriu 5

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        matriuInt[i][j] = midaMatriu;
                        midaMatriu--;
                    }
                }

                System.out.println("\nMatriu 5:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriuInt[i][j] + "\t");
                    }
                    System.out.println(" ");
                }

                //Matriu 6

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                matriuBoolean[i][j] = true;
                            } else {
                                matriuBoolean[i][j] = false;
                            }
                        }else {
                            if (j % 2 == 0) {
                                matriuBoolean[i][j] = false;
                            } else {
                                matriuBoolean[i][j] = true;
                            }
                        }
                    }
                }

                System.out.println("\nMatriu 6:\n");

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                            } else {
                                System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                            }
                        } else {
                            if (j % 2 == 0) {
                                System.out.print(RED_STRING + BLACK_CHAR + matriuBoolean[i][j] + RESET);
                            } else {
                                System.out.print(GREEN_STRING + BLACK_CHAR + matriuBoolean[i][j] + " " + RESET);
                            }
                        }
                    }
                    System.out.println(" ");
                }
            }
            case 8 -> System.out.println("Adeu...");
            default -> {
            }
        }
    }
}
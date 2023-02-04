public class Exemple_6_2_While {
    public static void main(String[] args) {

        final int TABLA = 5;
        final int MIN = 1;
        final int MAX = 10;

        int i = MIN;

        /*
        while (i <= MAX){
            System.out.println(i + "/" + MAX);
            i++;
        }
        */

        while (i <= MAX){
            System.out.println(i + " x " + TABLA + " = " + (i * TABLA));
            i++;
        }
    }
}

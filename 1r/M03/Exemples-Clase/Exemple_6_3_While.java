public class Exemple_6_3_While {
    public static void main(String[] args) {

        final int MIN = 97;
        final int MAX = 122;

        int valor = MIN;
        int i = 1;

        while (valor <= MAX){
            System.out.println((char)valor);
            valor++;
        }
    }
}

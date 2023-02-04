public class Exemple_18_1_Recursiva {
    /**
     * Mètode main
     * @param args
     */
    public static void main(String[] args) {
        virus(0);
    }

    /**
     * Mètode que s'executa a si mateix
     * @param x
     */
    private static void virus(int x){
        System.out.println(x);
        virus(x+1);
    }
}

public class Exemple_8_2_For {
    public static void main(String[] args) {

        int num = 10;

        for (int files = 1; files <= num; files++) {
            System.out.println("La tabla del " + files);
            for (int col = 1; col <= 10; col++) {
                System.out.println(col + " x " + files + " = " + (col*files));
            }

            System.out.println("-------------");
        }
    }
}

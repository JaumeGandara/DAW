public class Exemple_10_1_ArraySuma {
    public static void main(String[] args) {

        //Com fer un Array que sigui la suma d'altres 2

        int[] a = {1,2,3,4,5,6};
        int[] b = {6,8,7,1,2,3};
        //int[] c = new int[6];
        int[] c = new int[a.length]; //c {0,0,0,0,0,0}

        int[] d = {(int)((Math.random()+1)*10),(int)((Math.random()+1)*10),(int)((Math.random()+1)*10),(int)((Math.random()+1)*10),(int)((Math.random()+1)*10),(int)((Math.random()+1)*10)};
        int[] e = new int[d.length];

        System.out.println("Benvingut/da al programa...");
        System.out.println("Suma de arrays:");
        System.out.println(" ");

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];

            System.out.println(c[i]);
        }

        System.out.println(" ");
        System.out.println("Arrays random:");
        System.out.println(" ");

        for (int i = 0; i < e.length; i++) {

            System.out.println(d[i]);
        }
    }
}

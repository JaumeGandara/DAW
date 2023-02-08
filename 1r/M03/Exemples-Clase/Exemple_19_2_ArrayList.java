import java.util.ArrayList;

public class Exemple_19_2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomsAlumnes;
        nomsAlumnes = new ArrayList<>();

        nomsAlumnes.add("Andreu");
        nomsAlumnes.add("Maria");
        nomsAlumnes.add("Josep");

        mostraElementsArrayList(nomsAlumnes);

        nomsAlumnes.add(0,"Helena");//Per escollir la posició

        mostraElementsArrayList(nomsAlumnes);

        nomsAlumnes.set(0, "Geni");//Per sobreescriure (fent que "Helena desaparegui del mapa")

        mostraElementsArrayList(nomsAlumnes);

        nomsAlumnes.remove("Geni");//Esborra la posició que coincideix amb el nom introduït

        mostraElementsArrayList(nomsAlumnes);

        System.out.println("El primer nom és: " + nomsAlumnes.get(1));//Per veure el contingut de la posició
    }

    private static void mostraElementsArrayList(ArrayList<String> nomsAlumnes){
        /*
        for (int i = 0; i < nomsAlumnes.size(); i++) {
            System.out.println(nomsAlumnes.get(i));
        }
        */

        for (String nom:nomsAlumnes) {
            System.out.println(nom);
        }

        System.out.println("-----");
    }
}

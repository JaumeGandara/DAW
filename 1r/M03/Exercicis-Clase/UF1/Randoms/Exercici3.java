/*
3. Et dediques a vendre figures Otaku comprades a Tokio per wallapop.
Si estan en bonestat les pots revendre per un +25%, si no, per +10%. Implementa l’algoritme.
Dades: costInicial, preuVenda, bonEstat
*/
import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float costInicial, preuVenda;
        boolean bonEstat;

        System.out.println("Benvingut/da al programa...");
        System.out.print("Escriu l'import de la compra actual: ");
        costInicial = input.nextFloat();

        System.out.println("Està en bon estat? (true | false)");
        bonEstat = input.nextBoolean();

        if (bonEstat){
            preuVenda = costInicial * 1.25f;
        } else{
            preuVenda = costInicial * 1.10f;
        }

        System.out.printf("El preu de venda és: %.2f€", preuVenda);

    }
}
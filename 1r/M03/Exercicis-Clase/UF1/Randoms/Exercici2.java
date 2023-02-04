/*
2. A la botiga The bike house es fa un descompte del 20% als clients que son VIP i també
als clients que facin una compra de més de 200 €. Pensa un algoritme que implementi aquesta lògica.
Dades: DESCOMPTE, preuInicial, preuFinal, vip,
*/
import java.util.*;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final float DESCOMPTE = 0.80f;

        float preuInicial, preuFinal;
        boolean vip;

        do {
            System.out.println("Benvingut/da al programa...");
            System.out.print("Inserti el cost de la seva compra: ");
            preuInicial = input.nextFloat();
        }while (preuInicial <= 0);

        System.out.println("Ets VIP? (true | false)");
        vip = input.nextBoolean();

        if (vip || preuInicial > 200){
            preuFinal = preuInicial * DESCOMPTE;
            System.out.println("Se li ha implementat un descompte del 20%");
        }else {
            preuFinal = preuInicial;
            System.out.println("No se li ha implementat cap descompte");
        }

        System.out.printf("El cost de la seva compra actual és: %.2f€", preuFinal);
    }
}
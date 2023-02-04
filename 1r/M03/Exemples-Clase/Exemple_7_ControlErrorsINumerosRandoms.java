import java.util.Scanner;

public class Exemple_7_ControlErrorsINumerosRandoms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 0, max = 0, valorDau;
        boolean valorCorrect;

        do {
            System.out.print("Escriu el valor mínim: ");
            valorCorrect = input.hasNextInt();//comprova si es enter

            if (valorCorrect){
                min = input.nextInt();
            }else {
                System.out.println("Error: Valor no enter");
            }

            input.nextLine();
        }while (!valorCorrect);

        do {
            System.out.print("Escriu el valor màxim: ");
            valorCorrect = input.hasNextInt();//comprova si es enter

            if (valorCorrect){
                max = input.nextInt();
                if (max <= min){
                    System.out.println("Error: Valor més petit o igual que valor mínim");
                    valorCorrect = false;
                }
            }else {
                System.out.println("Error: Valor no enter");
            }

            input.nextLine();
        }while (!valorCorrect);

        do {
            valorDau = (int)((Math.random()*max)+min);
            System.out.println("El valor és: " + valorDau);
        }while (valorDau < min || valorDau > max);

        System.out.println("El teu dau ha sortit amb el valor: " + valorDau);
    }
}

/*
    Ingresar 2 valores y determinar cuál es el mayor
*/
import java.util.Scanner;

class e6
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n1 = 0, n2 = 0;


        System.out.print("* Digite el primer numero: ");
        n1 = input.nextInt();

        System.out.print("* Digite el segundo numero: ");
        n2 = input.nextInt();
        
        if(n1 > n2) System.out.println("* " + n1 + " es mayor que " + n2);
        else if(n1 < n2) System.out.println("* " + n2 + " es mayor que " + n1);
        else System.out.println("* Ambos numeros son iguales");
    }
}
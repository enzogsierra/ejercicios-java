/*
    Escribir un algoritmo que pida 3 enteros y muestre el menor
*/

import java.util.Scanner;

class e19
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n1, n2, n3;
        n1 = n2 = n3 = 0;

        System.out.print("* Ingrese el 1er numero: ");
        n1 = input.nextInt();
        
        System.out.print("* Ingrese el 2do numero: ");
        n2 = input.nextInt();

        System.out.print("* Ingrese el 3er numero: ");
        n3 = input.nextInt();
        
        if(n1 <= n2 && n1 <= n3) System.out.println("* " + n1 + " es el menor valor");
        else if(n2 <= n1 && n2 <= n3) System.out.println("* " + n2 + " es el menor valor");
        else System.out.println("* " + n3 + " es el menor valor");
    }
}
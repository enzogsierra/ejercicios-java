/*
    8. Determinar si un número es PAR o IMPAR.
*/

import java.util.Scanner;

class e8
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Ingrese un numero ");
        n = input.nextInt();
        
        System.out.println("* El numero " + n + " es " + ((n % 2 == 0) ? ("par") : ("impar")));
    }
}
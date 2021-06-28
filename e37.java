/*
    Escribir un algoritmo que pida 10 números aleatorios y visualice el menor y el mayor
*/

import java.util.Scanner;

class e37
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n, i = 0, min = 2147483647, max = 0;

        while(i++ < 10)
        {
            System.out.print("* Digite " + ((i == 0) ? ("un numero") : ("otro numero")) + " aleatorio: ");
            n = input.nextInt();

            if(n > max) max = n;
            if(n < min) min = n;
        }

        System.out.println("* El mayor numero es " + max);
        System.out.println("* El menor numero es " + min);
    }
}
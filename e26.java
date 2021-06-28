/*
    Escribir un algoritmo que pida un entero y visualice su tabla de multiplicación. Usar MIENTRAS, REPETIR y PARA.
*/

import java.util.Scanner;

public class e26
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        int n, i;

        System.out.print("* Digite un numero para conocer su tabla: ");
        n = input.nextInt();

        // Metodo repetir
        i = 0;

        System.out.println("*** Metodo repetir: ");
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("" + n + " * " + (++i) + " = " + (n * i));
        System.out.println("\n\n");

        // Metodo while
        i = 1;

        System.out.println("*** Metodo while: ");
        while(i <= 10) 
        {
            System.out.println("" + n + " * " + i + " = " + (n * i));
            i++;
        }
        System.out.println("\n\n");


        // Metodo for
        System.out.println("*** Metodo for: ");

        for(i = 1; i <= 10; i++)
        {
            System.out.println("" + n + " * " + i + " = " + (n * i));
        }
    }
}

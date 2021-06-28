/*
    La secuencia de números de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13…, se obtiene partiendo de los números 0, 1 y a partir de ellos cada 
    número se obtiene sumando los 2 anteriores:
        • an = an-1 + an-2
    Escribir un programa que visualice n cantidad de números de Fibonacci
*/

import java.util.Scanner;

class e43 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        final int n = 10;
        int x = 0, y = 1, z = 1;

        for(int i = 1; i < n; i++)
        {
            z = x + y;
            System.out.print(z + " ");

            x = y;
            y = z;
        }
    }
}

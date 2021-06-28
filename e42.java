/*
    Escribir un programa que calcule la potencia de un número. La función recibirá como parámetros la base y el exponente
*/

import java.util.Scanner;

class e42 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.print("* Digite un numero: ");
        int n1 = input.nextInt();

        System.out.print("* Digite un numero: ");
        int n2 = input.nextInt();

        System.out.println("* La potencia de " + n1 + " (" + n2 + ") es: " + power(n1, n2));
    }

    static int power(int b, int e)
    {   
        int c = 1, i = 0;
        while(i++ < e)
        {
            c *= b;
        }
        return c;
    }
}

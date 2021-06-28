/*
    Escribir un algoritmo que muestre la suma de los 30 primeros números impares, dónde “n” es un valor ingresado por teclado
*/

import java.util.Scanner;

class code 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        final int n = 30;
        System.out.println("* La suma de los primeros " + n + " numeros impares es " + showFirstOddNumbers(n));
    }

    static int showFirstOddNumbers(int n)
    {
        int i = 0, c = 0;
        while(++i <= n)
        {
            c += (i * 2) - 1;
        }
        return c;
    }
}
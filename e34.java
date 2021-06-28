/*
    Realizar un algoritmo que permita pedir 15 números y determine e imprima cuantos son pares, impares, positivos y negativos
*/

import java.util.Scanner;

class e34 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n, i, par, impar, pos, neg;
        n = i = par = impar = pos = neg = 0;

        while(i++ < 15)
        {
            System.out.print("* Digite un numero cualquiera: ");
            n = input.nextInt();

            if(n % 2 == 0) par++;
            else impar++;

            if(n >= 0) pos++;
            else neg++;
        }

        System.out.println("* " + par + " numeros fueron pares");
        System.out.println("* " + impar + " numeros fueron impares");
        System.out.println("* " + pos + " numeros fueron positivos");
        System.out.println("* " + neg + " numeros fueron negativos");
    }
}
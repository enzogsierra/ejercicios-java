/*
    Desarrollar un algoritmo que determine si un número ingresado es primo o compuesto
*/

import java.util.Scanner;

class e36
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        System.out.print("* Digite un numero: ");
        int n = input.nextInt();

        if(isPrimeNumber(n)) System.out.println("* El numero " + n + " es un numero primo");
        else System.out.println("* El numero " + n + " es un numero compuesto");
    }


    static boolean isPrimeNumber(int n)
    {
        if(n <= 1) return false;
        
        for(int i = 2; i <= n / 2; i++) 
        {
            if((n % i) == 0) return false;
        }
        return true;
    }
}
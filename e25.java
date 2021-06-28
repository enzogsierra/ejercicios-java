/*
    Escribir un algoritmo que pida un entero positivo y calcule su factorial: para todo número natural (n), se llama "n factorial" o 
    "factorial de n" al producto de todos los naturales desde 1 hasta (n)
*/

import java.util.Scanner;

public class e25 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        int n;
        System.out.print("* Digite un numero para conocer su factorial: ");
        n = input.nextInt();

        System.out.println("* El factorial de " + n + " es: " + factorial(n));
    }

    static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }
}

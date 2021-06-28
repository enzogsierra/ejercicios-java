/*
Ingresar un entero y determinar si es positivo, negativo o neutro
*/

import java.util.Scanner;

class e3 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Digite un numero: ");
        n = input.nextInt();

        if(n > 0) System.out.println("* El numero ingresado es positivo.");
        else if(n < 0) System.out.println("* El numero ingresado es negativo.");
        else System.out.println("* El numero ingresado es neutro.");
    }
}
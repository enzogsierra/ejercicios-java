/*
    Escribir un algoritmo que muestre los “n” primeros números pares, dónde “n” es un valor ingresado por el usuario
*/

import java.util.Scanner;

class e27 
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

        for(int i = 1; i <= n; i++) System.out.print(" " + (i * 2));
    }
}
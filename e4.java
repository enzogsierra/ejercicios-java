/*
Calcular el Cuadrado y el Cubo de un número ingresado
*/

import java.util.Scanner;

class e4 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        float n = 0;

        System.out.print("* Digite un numero: ");
        n = input.nextFloat();

        System.out.println("* El cuadrado de " + n + " es: " + n * n);
        System.out.println("* El cubo de " + n + " es: " + n * n * n);
    }
}
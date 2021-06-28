/*
    Escribir un algoritmo que pida un entero positivo y calcule y muestre su cubo si el número tiene un digito, el cuadrado si tiene 
    2 dígitos y la raíz cuadrada si tiene más de 3 dígito
*/

import java.util.Scanner;
import java.lang.Math;

class e38
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

        if(n < 10) System.out.println("* El cubo de " + n + " es " + n * n * n);
        else if(n < 100) System.out.println("* El cuadrado de " + n + " es " + n * n);
        else System.out.println("* La raiz cuadrada de " + n + " es " + Math.sqrt(n));
    }
}
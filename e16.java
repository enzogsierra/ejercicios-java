/*
    Escriba un programa para calcular la longitud de la circunferencia y el área del circulo para un radio introducido por teclado
*/

import java.util.Scanner;

class e16
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        final float pi = 3.14f;
        float fR = 0;

        System.out.print("* Digite el radio: ");
        fR = input.nextFloat();
         
        System.out.println("* Longitud = " + (pi * pi) * fR);
        System.out.println("* Area = " + pi * (fR * fR));
    }
}
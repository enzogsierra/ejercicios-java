/* 
    Escribir un programa que lea el radio de un círculo y a continuación visualice: área del círculo, diámetro del círculo y la longitud
    de la circunferencia.
*/

import java.util.Scanner;

class e41
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        float fR;

        System.out.print("* Digite un radio: ");
        fR = input.nextFloat();

        System.out.println("* Area del circulo: " + (Math.PI * Math.pow(fR, 2.0)));
        System.out.println("* Diametro del circulo: " + (fR * 2.0));
        System.out.println("* Longitud de la circurferencia: " + (Math.PI * (fR * 2.0)));
    }
}
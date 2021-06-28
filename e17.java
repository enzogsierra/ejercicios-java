/*
    Convertir un valor ingresado en horas a minutos y segundos y mostrarlos por pantalla
*/

import java.util.Scanner;

class e17
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int h = 0;

        System.out.print("* Digite un valor: ");
        h = input.nextInt();
         
        System.out.println("* " + h + " horas son " + (h * 60) + " minutos o " + (h * 3600) + " segundos");
    }
}
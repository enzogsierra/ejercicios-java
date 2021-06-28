/*
    Crear un programa que pida un número y visualice el mes correspondiente a dicho número. El mes estará almacenado en una lista
*/

import java.util.Scanner;

class e32 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        //
        System.out.print("* Ingrese un mes: ");
        n = input.nextInt();

        if(n <= 0 || n >= 13) 
        {
            System.out.println("* Mes invalido"); 
            return;
        }

        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; 
        System.out.println("* El mes " + n + " corresponde a " + mes[n - 1]);
    }
}

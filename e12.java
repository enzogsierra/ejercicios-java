/*
    Escribir un algoritmo que pida que se ingrese un año y determine si este año es bisiesto. Un año es bisiesto 
    cuando es múltiplo de 4 y no de 100 o cuando es múltiplo de 400. Por ejemplo, el año 200 por las 2 primeras 
    condiciones no sería bisiesto, pero sí lo es porque es múltiplo de 400; el año 2100 no es bisiesto porque, aunque 
    sea múltiplo de 4, también lo es de 100 y no es múltiplo de 400.
*/

import java.util.Scanner;

class e12
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Ingrese un anho: ");
        n = input.nextInt();
        
        if(isLeapYear(n) == 1) System.out.println("* El anho " + n + " es bisiesto");
        else System.out.println("* El anho " + n + " no es bisiesto");
    }

    static int isLeapYear(int year)
    {
        return ((400 % year == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? (1) : (0);
    }
}
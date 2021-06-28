/*
    Desarrollar un algoritmo que lea una fecha representada por 2 enteros, mes y año, y de cómo resultado los días 
    correspondientes al mes. Esto es:
        • Mes (##): 5
        • Año (####): 2005
        • El mes 5 del año 2005 tiene 31 días
*/

import java.util.Scanner;

class e14
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int m, y, d;
        m = y = d = 0;

        System.out.print("* Ingrese un mes: ");
        m = input.nextInt();
        
        System.out.print("* Ingrese un anho: ");
        y = input.nextInt();
        
        switch(m)
        {
            case 4: d = 30; break;
            case 6: d = 30; break;
            case 9: d = 30; break;
            case 11: d = 30; break;
            case 1: d = 31; break;
            case 3: d = 31; break;
            case 5: d = 31; break;
            case 7: d = 31; break;
            case 8: d = 31; break;
            case 10: d = 31; break;
            case 12: d = 31; break;
            case 2: d = (isLeapYear(y) == 1) ? 29 : 28; break;
            default: System.out.println("* Mes no valido"); return;
        }

        System.out.println("\n\n\n* Mes: " + m);
        System.out.println("* Anho: " + y);
        System.out.println("* El mes " + m + " del anho " + y + " tiene " + d + " dias.");
    }

    static int isLeapYear(int year)
    {
        return ((400 % year == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? (1) : (0);
    }
}
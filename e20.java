/*
    Escribir un algoritmo que calcula la edad de una persona recibiendo como entrada la fecha de nacimiento y la fecha actual, 
    ambas en 3 variables
*/

import java.util.Scanner;
import java.time.LocalDate;

class e20
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n1, n2, n3;
        n1 = n2 = n3 = 0;

        System.out.print("* Ingrese el dia: ");
        n1 = input.nextInt();
        
        System.out.print("* Ingrese el mes: ");
        n2 = input.nextInt();

        System.out.print("* Ingrese el anho: ");
        n3 = input.nextInt();
        
        System.out.println("* Edad:" + getYearsLapsed(n1, n2, n3));
    }

    static int getYearsLapsed(int d, int m, int y)
    {
        LocalDate date = LocalDate.now();
        return ((date.getYear() - y) - (((date.getMonthValue() * 31) + date.getDayOfMonth() < (m * 31) + d) ? (1) : (0)));
    }
}
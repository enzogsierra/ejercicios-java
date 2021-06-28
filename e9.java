/*
    Elaborar un algoritmo que reciba el salario bruto de un empleado y calcule su descuento de la Obra Social 
    de acuerdo con su nivel salarial.

    Salario                     % de descuento
    Hasta $30.000               5%
    Hasta $45.000               %7
    Hasta $75.000               %9
    Por encima de $75.000       %10
*/

import java.util.Scanner;

class e9
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Ingrese un salario bruto para calcular su descuento por Obra Social: ");
        n = input.nextInt();
        
        if(n <= 0) System.out.println("* Sueldo no valido");
        else if(n <= 30000) System.out.println("* Su descuento es de 5%");
        else if(n <= 45000) System.out.println("* Su descuento es de 7%");
        else if(n <= 75000) System.out.println("* Su descuento es de 9%");
        else System.out.println("* Su descuento es de 10%");
    }
}
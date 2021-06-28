/*
    Escribir un algoritmo que calcule el promedio de 7 alumnos, recibiendo como entrada 3 notas y mostrando las notas 
    ingresadas y el promedio de los alumnos
*/

import java.util.Scanner;

public class e23 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int nota[][];
        nota = new int[7][3];

        for(int i = 1; i <= 7; i++)
        {
            for(int j = 1; j <= 3; j++) 
            {
                System.out.print("* Introduzca la nota " + j + " para el alumno " + i + ": ");
                nota[i - 1][j - 1] = input.nextInt();
            }
            System.out.println("");
        }

        System.out.print("\n\n\n");
        for(int i = 0; i < 7; i++)
        {
            System.out.print("\n* Alumno " + (i + 1) + ": " + nota[i][0] + " + " + nota[i][1] + " + " + nota[i][2] + " (promedio: " + ((nota[i][0] + nota[i][1] + nota[i][2]) / 3));
        }
        
    }
}

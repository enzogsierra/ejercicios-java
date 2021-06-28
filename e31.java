/*
    Crear una tabla de enteros de 3x4, visualizando:
        • La tabla
        • La suma de filas
        • La suma de columnas
        • La suma total del valor de sus elementos
*/

import java.util.Scanner;
import java.util.Random;

class e31 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
       showMenu(); 
    }

    static void showMenu()
    {
        //
        int list[][];
        list = new int[3][4];

        //
        Random r = new Random();
        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 4; j++) list[i][j] = r.nextInt(10);
        }

        //
        int cc = 0, rc = 0, tc = 0;

        for(int i = 0; i < 3; i++)
        {
            cc = 0;
            System.out.print("{");
            for(int j = 0; j < 4; j++)
            {
                System.out.print(list[i][j] + ((j < 3) ? (", ") : ("")));
                cc += list[i][j];
            }
            System.out.println("} = " + cc);
            tc += cc;
        }

        //
        System.out.println(" =  =  =  =");
        for(int j = 0; j < 4; j++)
        {
            rc = 0;
            for(int i = 0; i < 3; i++)
            {
                rc += list[i][j];
            }

            System.out.print(" " + rc);
        }

        System.out.println("\n* Total: " + tc);
    }
}
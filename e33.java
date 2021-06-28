/*
    Crear una tabla de (i)x(j) con números aleatorios, y visualizar tanto la tabla como el mayor y el menor valor discriminados
*/

import java.util.Scanner;
import java.util.Random;

class e33 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
       showMenu(); 
    }

    static void showMenu()
    {
        final int sizeof = 3;

        //
        int list[][];
        list = new int[sizeof][sizeof];

        //
        Random r = new Random();
        for(int i = 0; i < sizeof; i++) 
        {
            for(int j = 0; j < sizeof; j++) list[i][j] = r.nextInt(100);
        }

        //
        int max = 0, min = 2147483647;

        for(int i = 0; i < sizeof; i++)
        {
            System.out.print("{");
            for(int j = 0; j < sizeof; j++)
            {
                System.out.print(list[i][j] + ((j < sizeof - 1) ? (", ") : ("")));
                
                if(list[i][j] > max) max = list[i][j];
                if(list[i][j] < min) min = list[i][j];
            }
            System.out.println("}");
        }

        System.out.println("* Valor mas alto: " + max);
        System.out.println("* Valor mas bajo: " + min);
    }
}
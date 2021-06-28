/*
    Crear un vector de 10 números enteros, y visualizar tanto sus valores como la suma de sus elementos
*/

import java.util.Scanner;
import java.util.Random;

class e30 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
       showMenu(); 
    }

    static void showMenu()
    {
        // 
        int n[];
        n = new int[10];

        // Random
        Random r = new Random();
        for(int i = 0; i < n.length; i++) n[i] = r.nextInt(10) + 1;

        // Mostrar y sumar
        int c = 0;
        for(int i = 0; i < n.length; i++)
        {
            System.out.println("#" + i + " - " + n[i]);
            c += n[i];
        }
    
        System.out.println("* Total: " + c);
    }
}

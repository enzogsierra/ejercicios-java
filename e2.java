/*
    Escribir un algoritmo que halle la media aritmética de los valores x, y, z. Debe visualizarse tanto los valores 
    ingresados como el promedio como salida.
*/

import java.util.Scanner;

class e2 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        float x, y, z;
        x = y = z = 0;

        System.out.print("* Digite el primer numero: ");
        x = input.nextFloat();

        System.out.print("* Digite el segundo numero: ");
        y = input.nextFloat();
        
        System.out.print("* Digite el tercer numero: ");
        z = input.nextFloat();
        
        System.out.println("* La media aritmetica (o promedio) de \"" + x + " + " + y + " + " + z + "\" es: " + (x + y + z) / 3);
    }
}
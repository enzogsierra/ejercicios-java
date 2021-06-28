/*
    Se desea calcular la superficie de un trapecio. Para ello se ingresa la longitud de ambas bases y la altura. 
    La fórmula es: ((Base Mayor + Base Menor) / 2) x Altura
*/

import java.util.Scanner;

class e5 
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

        System.out.print("* Ingrese la base mayor: ");
        x = input.nextFloat();

        System.out.print("* Ingrese la base menor: ");
        y = input.nextFloat();
        
        System.out.print("* Ingrese la altura: ");
        z = input.nextFloat();
        
        System.out.println("* La superficie del trapecio es: " + ((x + y) / 2) * z);
    }
}
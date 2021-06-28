/*
    Escribir un algoritmo que lea 3 enteros y emita un mensaje que indique que están o no en orden numérico crecente
*/

import java.util.Scanner;

class e15
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

        System.out.print("* Ingrese el 1er numero: ");
        n1 = input.nextInt();
        
        System.out.print("* Ingrese el 2do numero: ");
        n2 = input.nextInt();

        System.out.print("* Ingrese el 3er numero: ");
        n3 = input.nextInt();
        
        
        if(n1 <= n2 && n2 <= n3) System.out.println("* Los numeros estan en orden crecente");
        else System.out.println("* Los numeros NO estan en orden crecente");
    }
}
/*
    Escribir un algoritmo que realice las 4 operaciones aritméticas básicas. Verificar la división por cero.
*/

import java.util.Scanner;

class e1 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n1 = 0, n2 = 0;


        System.out.print("* Digite el primer numero: ");
        n1 = input.nextInt();

        System.out.print("* Digite el segundo numero: ");
        n2 = input.nextInt();
        

        System.out.println("\n[Suma] " + n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println("[Resta] " + n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println("[Multiplicacion] " + n1 + " * " + n2 + " = " + (n1 * n2));
        if(n1 == 0 || n2 == 0) System.out.println("[Division] (No se puede dividir entre 0)");
        else System.out.println("[Division] " + n1 + " / " + n2 + " = " + (n1 / n2));
    }
}
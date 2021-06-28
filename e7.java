/*
    Ingresar la edad de una persona y mostrar el siguiente mensaje:
        • “Es un niño”; si edad es entre 0 y 12 años.
        • “Es un adolescente”; si edad es entre 12 y 20.
        • “Es un adulto”; si es mayor de 21 años.
*/

import java.util.Scanner;

class e7
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Digite una edad: ");
        n = input.nextInt();
        
        if(n < 0) System.out.println("* Edad invalida");
        else if(n >= 0 && n <= 12) System.out.println("* Es un ninho");
        else if(n >= 13 && n <= 20) System.out.println("* Es un adolescente");
        else System.out.println("* Es un adulto");
    }
}
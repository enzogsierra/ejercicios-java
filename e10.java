/*
    Ingresar un número y determinar a qué día de la semana corresponde. Utilizar SI-ENTONCES.
*/

import java.util.Scanner;

class e10
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Ingrese un dia de la semana (entre 1-7): ");
        n = input.nextInt();
        
        if(n <= 0 || n >= 8) System.out.println("* Dia invalido");
        if(n == 1) System.out.println("* Lunes");
        if(n == 2) System.out.println("* Martes");
        if(n == 3) System.out.println("* Miercoles");
        if(n == 4) System.out.println("* Jueves");
        if(n == 5) System.out.println("* Viernes");
        if(n == 6) System.out.println("* Sabado");
        if(n == 7) System.out.println("* Domingo");
    }
}
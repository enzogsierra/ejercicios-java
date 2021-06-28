/*
    Ingresar un número y determinar a qué día de la semana corresponde. Utilizar SEGÚN-CASO
*/

import java.util.Scanner;

class e11
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
        
        switch(n)
        {
            case 1: System.out.println("* Lunes"); break;
            case 2: System.out.println("* Martes"); break;
            case 3: System.out.println("* Miercoles"); break;
            case 4: System.out.println("* Jueves"); break;
            case 5: System.out.println("* Viernes"); break;
            case 6: System.out.println("* Sabado"); break;
            case 7: System.out.println("* Domingo"); break;
            default: System.out.println("* Dia invalido"); break;
        }
    }
}
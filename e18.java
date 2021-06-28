/*
    Escribir un algoritmo que escriba la calificación correspondiente a la nota, de acuerdo con el siguiente criterio:
        • Entre 0 y 6: Suspenso
        • Entre 6 inclusive y 8: Aprobado
        • Entre 8 inclusive y 9: Distinguido
        • Entre 9 inclusive y 10: Sobresaliente
        • 10: Matrícula de honor
*/

import java.util.Scanner;

class e18
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n = 0;

        System.out.print("* Ingrese una nota: ");
        n = input.nextInt();
        
        if(n >= 0 && n <= 5) System.out.println("* Suspenso");
        else if(n <= 7) System.out.println("* Aprobado");
        else if(n == 8) System.out.println("* Distinguido");
        else if(n == 9) System.out.println("* Sobresaliente");
        else if(n == 10) System.out.println("* Matricula de honor");
    }
}
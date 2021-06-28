/*
    Escribir un programa que muestre un menú, con las siguientes opciones:
        • 1) Convertir Celsius a Fahrenheit
        • 2) Convertir Fahrenheit a Celsius
        • 0) Salir
        
    Dado que:
        • C° = 9/5 * (F° + 32)
        • F° = 5/9 * (C° - 32)
*/

import java.util.Scanner;

class e44
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("(1) Convertir Celsius a Fahrenheit");
            System.out.println("(2) Convertir Fahrenheit a Celsius");
            System.out.println("(3) Salir");

            int n = input.nextInt();

            switch(n)
            {
                case 1:
                {
                    System.out.print("* Digite un numero en Celsius para convertir a Fahrenheit: ");
                    n = input.nextInt();

                    System.out.println("* " + n + " grados Celsius equivalen a " + ((5 / 9) * (n - 32)) + " grados Fahrenheit.\n\n");
                    break;
                }
                case 2:
                {
                    System.out.print("* Digite un numero en Fahrenheit para convertir a Celsius: ");
                    n = input.nextInt();

                    System.out.println("* " + n + " grados Fahrenheit equivalen a " + ((9 / 5) * (n + 32)) + " grados Celsius.\n\n");
                    break;
                }
                case 3: return;
                default: System.out.println("* Opcion invalida, intente otra vez"); break;
            }
        }
    }
}

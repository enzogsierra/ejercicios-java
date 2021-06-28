/*
    Escribir y ejecutar un programa que simule un calculador simple. Lee el operando 1, el operador y el operando 2. Según el 
    operador ingresado, que imprima la adición, sustracción, producto, cociente o resto. Utilizar la sentencia SEGÚN-CASO
*/

import java.util.Scanner;

public class e22 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        int n1, n2;
        char c;

        System.out.print("* Digite el primer numero: ");
        n1 = input.nextInt();

        System.out.print("* Digite el operador (+, -, *, /, %): ");
        c = input.next().charAt(0);

        System.out.print("* Digite el segundo numero: ");
        n2 = input.nextInt();

        switch(c)
        {
            case '+': System.out.println("* " + n1 + " + " + n2 + " = " + (n1 + n2)); break;
            case '-': System.out.println("* " + n1 + " - " + n2 + " = " + (n1 - n2)); break;
            case '*': System.out.println("* " + n1 + " * " + n2 + " = " + (n1 * n2)); break;
            case '/': System.out.println((n1 == 0 || n2 == 0) ? ("No se puede dividir entre 0") : ("* " + n1 + " / " + n2 + " = " + (n1 / n2))); break;
            case '%': System.out.println("* " + n1 + " % " + n2 + " = " + (n1 % n2)); break;
            default: System.out.println("* Operador no valido.");
        }
    }
}

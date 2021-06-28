/*
    El domingo de pascua es el primer domingo después de la primera luna llena posterior al equinoccio de otoño, y se determina 
    mediante el sencillo calculo:
        • A = año MOD 19
        • B = año MOD 4
        • C = año MOD 7
        • D = (19 * A + 24) MOD 30
        • E = (2 * B + 4 * C + 6 * D + 5) MOD 7
        • N = (22 + D + E);
    Donde N indica el número de día del mes de marzo (si N es igual o menor que 31) o abril (si es mayor que 31). 
    Construir un programa que determine fechas de domingos de Pascua.
*/

import java.util.Scanner;

class e39
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        showMenu();
    }

    static void showMenu()
    {
        
    }
}
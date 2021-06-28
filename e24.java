/*
    Desarrollar un algoritmo que muestre los 50 primeros números enteros positivos
*/

public class e24 
{
    public static void main(String args[])
    {
        showFirst(50);
    }

    static void showFirst(int value)
    {
        for(int i = 1; i <= value + 1; i++) System.out.print(" " + i);
    }
}

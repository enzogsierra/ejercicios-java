/*
    Conociendo que la distancia entre la Luna y la Tierra es de 238857 millas, y que una milla equivale a 1,609 km, 
    escribir un programa que visualice la distancia entre los 2 astros en Km.
*/

import java.util.Scanner;

class e13
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[])
    {
        float distance = 238857.0f; // Distancia entre la Luna y la Tierra en millas

        System.out.println("* La distancia entre la Luna y la Tierra es de " + distance + " millas (o " + convertMilesToKm(distance) + " KM)");
    }

    static float convertMilesToKm(float miles)
    {
        return (miles * 1.60934f);
    }
}
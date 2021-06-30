import java.util.Arrays;

public class Edades 
{
    public static void main(String args[])
    {
        int[] edades = {58, 91, 84, 33, 46, 82, 24, 29, 59, 99, 53, 59, 12, 65, 1, 7, 28, 41, 59, 29, 1, 39, 19, 67, 62, 59, 95, 29, 4, 2, 89, 57, 52, 7, 4, 5, 7, 1, 8, 15, 35, 88, 99, 35, 21, 4, 5}; 

        //
        int sum = 0;

        for(int i = 0; i < edades.length; i++)
        {
            sum += edades[i];
        }

        System.out.println("* Total de edades: " + edades.length);
        System.out.println("* Suma de todas las edades: " + sum);

        // Obtener promedio
        System.out.println("* Promedio: " + (sum / edades.length));

        // Obtener moda
        int[] moda = new int[0xFF];
        int hgst = 1;

        for(int i = 0; i < edades.length; i++)
        {
            if(++moda[edades[i]] > hgst) hgst = moda[edades[i]]; 
        }

        for(int i = 0; i < moda.length; i++)
        {
            if(moda[i] == hgst) System.out.println("* Moda: " + i + " (" + hgst + " veces)");
        }

        // Obtener mediana
        Arrays.sort(edades);

        if((edades.length % 2) == 1) System.out.println("* Mediana (impar): " + edades[(edades.length / 2)]);
        else System.out.println("* Mediana (par): " + ((edades[(edades.length / 2) - 1] + edades[(edades.length / 2)]) / 2));
    }
}

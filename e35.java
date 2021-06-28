/*
    Desarrollar un algoritmo que visualice todos los años bisiestos del siglo XX
*/

class e35 
{
    public static void main(String args[])
    {
        for(int i = 1901; i <= 2000; i++)
        {
            if(isLeapYear(i)) System.out.print(i + ", ");
        }
    }

    static boolean isLeapYear(int year)
    {
        return ((400 % year == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? (true) : (false);
    }
}
/*
    Escribir un programa que simule la funcionalidad de un cajero automático, con las siguientes operaciones:
        • Ingreso del cliente al cajero (a falta de tarjeta magnética, usar validación por usuario y clave)
        • Consulta de Saldos
        • Extracción
        • Depósito
        • Salir
*/

import java.util.Scanner;
import java.util.Random;

class e45 
{
    static Scanner input = new Scanner(System.in);

    static String user, pass;
    static int saldo;
    
    public static void main(String args[])
    {
        cls();

        // 
        Random r = new Random();
        saldo = r.nextInt(9000) + 1000;

        // Crear usuario
        System.out.print("[BANCO JAVA]\nIngrese un usuario: ");
        user = input.nextLine();

        System.out.print("Ahora ingrese una contrasenha: ");
        pass = input.nextLine();

        // Ingresar
        System.out.print("\n[BANCO JAVA]\nIngrese su usuario para iniciar sesion: ");
        while(true)
        {
            String tmp = input.nextLine();
            if(tmp.equals(user)) break;

            System.out.print("[<!>] Usuario no encontrado, intente otra vez: ");
        }

        int wpc = 0;
        System.out.print("Bienvenido, " + user + ". Ahora ingrese su contrasenha: ");
        while(true)
        {
            String tmp = input.nextLine();
            if(tmp.equals(pass)) break;

            if(++wpc < 3) System.out.print("[<!>] Contrasenha incorrecta (intento " + wpc + "/3). Ingrese su contrasenha: ");
            else
            {
                System.out.println("\n\n[<!>] Demasiadas contrasenhas incorrectas.");
                return;
            }
        }

        // Banco
        cls();
        System.out.println("[BANCO JAVA] " + user);

        while(true)
        {
            System.out.println("1) Consultar saldo");
            System.out.println("2) Extraer bolivares");
            System.out.println("3) Depositar bolivares");
            System.out.println("4) Salir");
            int opt = input.nextInt();

            switch(opt)
            {
                case 1: // Consultar
                {
                    System.out.println("[BANCO] Su saldo es: " + saldo + "\n");
                    break;
                }
                case 2: // Extraer
                {
                    boolean loop = true;
                    System.out.print("* Digite la cantidad de bolivares que quiere extraer (para volver atras, digite 0): ");

                    while(loop)
                    {
                        int n = input.nextInt();

                        if(n < 0) System.out.println("[<!>] Valor invalido, digite otro numero: ");
                        else if(n == 0) // Volver atras
                        {
                            System.out.print("\n\n");
                            loop = false;
                        }
                        else if(n <= saldo) // Operacion valida
                        {
                            saldo -= n;
                            System.out.println("* Has extraido " + n + " bolivares correctamente.");
                            loop = false;
                        }
                        else System.out.print("[<!>] Saldo insuficiente, digite otro numero: ");
                    }
                    break;
                }
                case 3: // Depositar
                {
                    System.out.print("* Digite la cantidad de bolivares que desee depositar (para volver atras, digite 0): ");

                    boolean loop = true;
                    while(loop)
                    {
                        int n = input.nextInt();

                        if(n < 0) System.out.println("* Cantidad no valida");
                        else if(n == 0) 
                        {
                            System.out.print("\n\n");
                            loop = false;
                        }
                        else
                        {
                            saldo += n;
                            loop = false;
                            System.out.println("* Has depositado " + n + " bolviares exitosamente\n");
                        }
                    }
                    break;
                }
                case 4: 
                {
                    System.out.print("\n\n[BANCO JAVA] (Sesion finalizada)");
                    return; // Salir
                }
                default: // Operacion no valida
                {
                    System.out.println("\n[<!>] Operacion invaldia");
                    break;
                }
            }
        }
    }

    static void cls()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}

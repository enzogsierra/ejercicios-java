/*
1. Añadir 4 tareas mas al programa AppTareas
2. Crear un programa AppMascotas que permita crear objetos de tipo Mascota, con los siguientes atributos:
    * nroFicha
    * nombre
    * fechaNacimiento
    * especie
    * raza
*/

package Mascotas;
import java.time.LocalDate;

class Mascota 
{
    // Atributos de la clase
    private int nroFicha;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String especie;
    private String raza;

    // Metodos
    // Setters
    public void asignarNroFicha(int n) 
    {
        nroFicha = n;
    }

    public void asignarNombre(String n)
    {
        nombre = n;
    }

    public void asignarEspecie(String e) 
    {
        especie = e;
    }

    public void asignarRaza(String r) 
    {
        raza = r;
    }

    public void asignarFechaNacimiento(LocalDate d)
    {
        fechaNacimiento = d;
    }

    // Getters
    public int obtenerNroFicha() 
    {
        return nroFicha;
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public String obtenerEspecie() 
    {
        return especie;
    }

    public String obtenerRaza() 
    {
        return raza;
    }
    
    public LocalDate obtenerFechaNacimiento()
    {
        return fechaNacimiento;
    }
}
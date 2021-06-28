package AppTarea;
import java.time.LocalDate;

class Tarea 
{
    // Atributos de la clase
    private int nro;
    private String descripcion;
    private LocalDate fecha;
    private boolean finalizado;

    // Metodos
    // Setters
    public void asignarNro(int n) 
    {
        nro = n;
    }

    public void asignarDescripcion(String des)
    {
        descripcion = des;
    }

    public void asignarFecha(LocalDate date)
    {
        fecha = date;
    }

    public void asignarFinalizado(boolean val) 
    {
        finalizado = val;
    }


    // Getters
    public int obtenerNro() 
    {
        return nro;
    }

    public String obtenerDescripcion()
    {
        return descripcion;
    }


    public LocalDate obtenerFecha()
    {
        return fecha;
    }

    public boolean obtenerFinalizado() 
    {
        return finalizado;
    }


    // NUEVAS TAREAS
    private String nombre;
    private int dni;
    private LocalDate fechaNacimiento;
    private String nroTelefono;

    // Setters
    public void asignarNombre(String n)
    {
        nombre = n;
    }

    public void asignarDNI(int n)
    {
        dni = n;
    }

    public void asignarFechaNacimiento(LocalDate f)
    {
        fechaNacimiento = f;
    }

    public void asignarNroTelefono(String n)
    {
        nroTelefono = n;
    }

    // Getters
    public String obtenerNombre()
    {
        return nombre;
    }

    public int obtenerDNI()
    {
        return dni;
    }

    public LocalDate obtenerFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public String obtenerNroTelefono()
    {
        return nroTelefono;
    }
}
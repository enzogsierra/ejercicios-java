package AppTarea;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

class AppTareas
{
    public static void main(String args[])
    {
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("* App para crear tareas *");
        System.out.println("* ===================== *");

        // Declarar una instancia de la clase tarea
        Tarea tarea = new Tarea();

        // Asignar nuevos valores a la tarea
        tarea.asignarNro(1);
        tarea.asignarDescripcion("Estudiar POO este finde XD");
        tarea.asignarFecha(LocalDate.now());
        tarea.asignarFinalizado(true);

        // Mostrar el objeto creado
        System.out.println("Tarea (instancia) creada:");
        System.out.println("Nro: " + tarea.obtenerNro());
        System.out.println("Descripcion: " + tarea.obtenerDescripcion());
        System.out.println("Fecha: " + tarea.obtenerFecha());
        System.out.println("Estado: " + (tarea.obtenerFinalizado() ? ("Finalizado") : ("Pendiente")));



        // NUEVAS TAREAS
        Tarea persona = new Tarea();

        persona.asignarNombre("Enzo Sierra");
        persona.asignarFechaNacimiento(LocalDate.of(1999, 8, 4));
        persona.asignarDNI(42579457);
        persona.asignarNroTelefono("+54 9 364-4438 2805");

        System.out.println("\n\n[PERSONA]");
        System.out.println("Nombre: " + persona.obtenerNombre());
        System.out.println("Fecha de nacimiento: " + persona.obtenerFechaNacimiento());
        System.out.println("DNI: " + persona.obtenerDNI());
        System.out.println("N° de telefono: " + persona.obtenerNroTelefono());
    } 
}
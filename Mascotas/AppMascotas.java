package Mascotas;
import java.time.LocalDate;

class AppMascotas
{
    public static void main(String args[])
    {
        System.out.println("* Fichero de mascotas *");
        System.out.println("* =================== *\n");

        // Declarar una nueva instancia de la clase
        Mascota pet = new Mascota();

        // Asignar nuevos valores a la tarea
        pet.asignarNroFicha(432);
        pet.asignarNombre("Lua");
        pet.asignarEspecie("Mamifero");
        pet.asignarRaza("Affenpinscher");
        pet.asignarFechaNacimiento(LocalDate.of(2020, 10, 6));

        // Mostrar el fichero de la mascota
        System.out.println("[Mascota]");
        System.out.println("Nro. de ficha: #" + pet.obtenerNroFicha());
        System.out.println("Nombre: " + pet.obtenerNombre());
        System.out.println("Especie: " + pet.obtenerEspecie());
        System.out.println("Raza: " + pet.obtenerRaza());
        System.out.println("Fecha de nacimiento: " + pet.obtenerFechaNacimiento());
    } 
}
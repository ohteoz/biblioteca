import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public String apellidos;
    public String dni;
    public ArrayList<Libros> libros_prestados;

    public Usuario(String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.libros_prestados = new ArrayList<Libros>();
    }

    public void pedirLibro(){

    }

    public void devolverLibro(){

    }
}
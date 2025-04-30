import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libros> libros;
    public ArrayList<Usuario> usuario;

    public Biblioteca () {
        this.libros = new ArrayList<>();
        this.usuario = new ArrayList<>();
    };

    public void crearUsuario(String nombre, String apellidos, String dni){
        usuario.add(new Usuario(nombre, apellidos, dni));
    };

    public void crearLibro(String isbn, String nombre, String autor, int ano){
        libros.add(new Libros(isbn, nombre, autor, ano ));
    };


}
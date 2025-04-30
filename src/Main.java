import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;
        System.out.println("===== MENU BIBLIOTECA =====");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Registrar libro");
        System.out.println("3. Pedir libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Dame el nombre de usuario: ");
                String nombre = sc.nextLine();

                System.out.print("Dame el apellido de usuario: ");
                String apellidos = sc.nextLine();

                System.out.print("Dame el DNI del usuario: ");
                String dni = sc.nextLine();

                biblioteca.crearUsuario(nombre, apellidos, dni);

                System.out.println("Usuario registrado correctamente.\n");
                break;

            case 2:
                System.out.print("Dame el ISBN del libro: ");
                String isbn = sc.nextLine();

                System.out.print("Dame el titulo del libro: ");
                String titulo = sc.nextLine();

                System.out.print("Dame el autor: ");
                String autor = sc.nextLine();

                System.out.print("Dame el año: ");
                int ano = sc.nextInt();
                sc.nextLine();

                biblioteca.crearLibro(isbn, titulo, autor, ano);
                System.out.println("Libro registrado correctamente");
                break;

            case 3:

            case 4:

            case 5:
                System.out.println("Saliendo del sistema");
                break;


            default:
                System.out.println("Opción no válida.");
        }

    }
}
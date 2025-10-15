import model.Libro;
import model.Biblioteca;
import model.Prestamo;
import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in)  ;

        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca(listaLibros,listaUsuarios,listaPrestamos);

        Libro libroJS = new Libro(1, "Java para novatos", "Borja Martin", false);
        Libro libroKT = new Libro(2,"kotlin para lerdos", "Don Fernando",false);

        Usuario usuario1 = new Usuario(1, "Pablo",35);
        Usuario usuario2 = new Usuario(2, "Fer",50);


    //MENU
     int opcion;

     do{
         System.out.println("""
                 ========== MENU ==========
                 Opcion 1: Agregar Libro
                 Opcion 2: mostrar libros
                 Opcion 3: eliminar Libro
                 Opcion 4: Agregar Usuario
                 opcion 5: Eliminar usuario
                 Opcion 6: Mostrar Usuarios
                 opcion 7: Crear Prestamo
                 Opcion 8: Mostrar prestamos
                 
                 INTRODUCE UNA OPCIÓN:
                 """ );
         opcion = leer.nextInt();

         switch (opcion){
             case 1:
                 biblioteca.agregarLibro(libroJS);
                 break;
             case 2:
                biblioteca.mostrarListaLibros();
                 break;
             case 3:
                 biblioteca.eliminarLibro(libroJS);
                 break;
             case 4:
                 biblioteca.agregarUsuario(usuario1);
                 break;
             case 5:
                 System.out.printf("Introduce id de Usuario para eliminar: \n");
                 int idUsuario = leer.nextInt();
                 biblioteca.eliminarUsuario(idUsuario);
                 break;
             case 6:
                 biblioteca.mostrarUsuarios();
                 break;
             case 7:
                 System.out.println("Introduce id del libro: \n");
                 int idLibro = leer.nextInt();
                 System.out.println("Introduce id del usuario: \n");
                  idUsuario = leer.nextInt();
                 biblioteca.crearPrestamo(idLibro, idUsuario);
                 break;
             default:
                 System.out.printf("si no es ninguno de los numeros opcion no valida");
         }

     } while (opcion!=0);
        leer.close();

    }

}

package model;

public class Prestamo {

    //atributos de clase Prestamo
    private int id;
    private Libro libro;
    private Usuario usuario;


    //constructor vacio
    public void Usuario(){}


    //constructor generado con todos los atributos
    public Prestamo(int id,Libro libro, Usuario usuario) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
    }

    //metodos de clase Prestamo

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("libro = " + libro);
        System.out.println("usuario = " + usuario);
    }

    //toString generado para mostrar datos de Prestamo
    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", libro=" + libro +
                ", usuario=" + usuario +
                '}';
    }


    //get generados
    public int getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    //set generados
    public void setId(int id) {
        this.id = id;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

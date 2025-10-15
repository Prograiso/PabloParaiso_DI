package model;

public class Libro {

    //atributos
    private int id;
    private String titulo,autor;
    private boolean prestado;

    //constructor vacio
    public Libro() {

    }


    //constructor generate con todos los atributos
    public Libro(int id, String titulo, String autor, boolean prestado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }


    //metodos de clase Libro:

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("prestado = " + prestado);
    }



    //metodo generate toString para mostrar atributos de Libro
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }


    //get generados
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    //set generados
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}


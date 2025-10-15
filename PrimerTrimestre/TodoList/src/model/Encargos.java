package model;

public class Encargos {

    private int id;
    private String titulo;
    private boolean completado;


    public Encargos(int id, String titulo, boolean hecho ){

        this.id = id;
        this.titulo = titulo;
        // el boleano hecho no se pone xk es falso
    }

    public Encargos(){
    }

    public void mostrarDatosEncargo(){
        System.out.println("id = " + id);
        System.out.println("titulo = " + titulo);
        System.out.println("completado = " + completado);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean iscompletado() {
        return completado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHecho(boolean hecho) {
        this.completado = hecho;
    }

    @Override
    public String toString() {
        return "Encargo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", completado=" + completado +
                '}';
    }
}

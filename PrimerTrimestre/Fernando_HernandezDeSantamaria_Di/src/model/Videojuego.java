package model;

abstract public class Videojuego {
    private String titulo,desarrollador,clasificacionEdad;
    private int anoLanzamiento;
    private double precio;

    public Videojuego() {
    }

    public Videojuego(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamiento, double precio) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.clasificacionEdad = clasificacionEdad;
        this.anoLanzamiento = anoLanzamiento;
        this.precio = precio;
    }

    abstract public double calcularPrecioFinal();

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", clasificacionEdad='" + clasificacionEdad + '\'' +
                ", anoLanzamiento=" + anoLanzamiento +
                ", precio=" + precio +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

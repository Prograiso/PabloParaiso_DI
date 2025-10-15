package model;

abstract public class Videojuego {
    private String titulo;
    private String desarrollador;
    private int añoLanzamiento;
    private double precio;
    private String calsificacionEdad ;

    public Videojuego(){}


    abstract public double calcularPrecioFinal();

    public Videojuego(String titulo, String desarrollador, int añoLanzamiento, double precio, String calsificacionEdad) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.añoLanzamiento = añoLanzamiento;
        this.precio = precio;
        this.calsificacionEdad = calsificacionEdad;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", añoLanzamiento=" + añoLanzamiento +
                ", precio=" + precio +
                ", calsificacionEdad='" + calsificacionEdad + '\'' +
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

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCalsificacionEdad() {
        return calsificacionEdad;
    }

    public void setCalsificacionEdad(String calsificacionEdad) {
        this.calsificacionEdad = calsificacionEdad;
    }
}

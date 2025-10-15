package model;

public class VideojuegoEstrategia extends Videojuego{



    private int complejidad;
    private int duracionPartida;

    public VideojuegoEstrategia(){}



    public VideojuegoEstrategia(String titulo, String desarrollador, int añoLanzamiento, double precio, String calsificacionEdad, int complejidad, int duracionPartida) {
        super(titulo, desarrollador, añoLanzamiento, precio, calsificacionEdad);
        this.complejidad = complejidad;
        this.duracionPartida = duracionPartida;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        double precio = getPrecio();
        int incremento = getComplejidad() * 3;
        precioFinal = precio * incremento /100;
        return precioFinal;
    }
    @Override
    public String toString() {
        return super.toString() + "VideojuegoEstrategia{" +
                "complejidad=" + complejidad +
                ", duracionPartida=" + duracionPartida +
                '}';
    }


    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }
}

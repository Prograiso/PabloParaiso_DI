package model;

public class VideojuegoEstrategia extends Videojuego{

    private int complejidad,duracionPartida;

    public VideojuegoEstrategia() {
    }

    public VideojuegoEstrategia(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamiento, double precio, int complejidad, int duracionPartida) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamiento, precio);
        this.complejidad = complejidad;
        this.duracionPartida = duracionPartida;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio()+(getPrecio()*((double) (3*complejidad) /100));
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

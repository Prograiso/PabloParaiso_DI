package model;

public class VideojuegoAccion extends Videojuego {

    private int nivelViolencia;
    private boolean modoMultijugador;

    public void VideojuegoAccion(){}

    public VideojuegoAccion(String titulo, String desarrollador, int añoLanzamiento, double precio, String calsificacionEdad, int nivelViolencia, boolean modoMultijugador) {
        super(titulo, desarrollador, añoLanzamiento, precio, calsificacionEdad);
        this.nivelViolencia = nivelViolencia;
        this.modoMultijugador = modoMultijugador;
    }

    @Override
    public String toString() {
        return super.toString() + "VideojuegoAccion{" +
                "nivelViolencia=" + nivelViolencia +
                ", modoMultijugador=" + modoMultijugador +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = 0.0;
        double precio = getPrecio();
        if(getNivelViolencia()>3){
        precioFinal = precio + (precio*5/100);
        } if(modoMultijugador){
            precioFinal = precioFinal + (precioFinal*10/100);
        }
        return precioFinal;
    }

    public int getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    public boolean isModoMultijugador() {
        return modoMultijugador;
    }

    public void setModoMultijugador(boolean modoMultijugador) {
        this.modoMultijugador = modoMultijugador;
    }
}

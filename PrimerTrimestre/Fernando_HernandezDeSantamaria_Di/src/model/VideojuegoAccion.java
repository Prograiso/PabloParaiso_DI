package model;

public class VideojuegoAccion extends Videojuego{
    private int nivelViolencia;
    private boolean modoMultijugador;

    public VideojuegoAccion() {
    }

    public VideojuegoAccion(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamiento, double precio, int nivelViolencia, boolean modoMultijugador) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamiento, precio);
        this.nivelViolencia = nivelViolencia;
        this.modoMultijugador = modoMultijugador;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 0.0;
        if (nivelViolencia>3) precio+= getPrecio()+(getPrecio()*0.05);
        if (modoMultijugador) precio+=getPrecio()+(getPrecio()*0.1);
        return precio;
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

package model;

public class VideojuegoRpg extends Videojuego{

    private boolean mundoAbierto;
    private int horasHistoriaPrincipal;

    public VideojuegoRpg(){}

    public VideojuegoRpg(String titulo, String desarrollador, int añoLanzamiento, double precio, String calsificacionEdad, boolean mundoAbierto, int horasHistoriaPrincipal) {
        super(titulo, desarrollador, añoLanzamiento, precio, calsificacionEdad);
        this.mundoAbierto = mundoAbierto;
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        int incremento = 0;

        if(mundoAbierto){
            incremento += 15;
        }
        incremento += horasHistoriaPrincipal/2;
        precioFinal= getPrecio() + (getPrecio()* incremento)/100;

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "VideojuegoRpg{" +
                "mundoAbierto=" + mundoAbierto +
                ", horasHistoriaPrincipal=" + horasHistoriaPrincipal +
                '}';
    }

    public boolean isMundoAbierto() {
        return mundoAbierto;
    }

    public void setMundoAbierto(boolean mundoAbierto) {
        this.mundoAbierto = mundoAbierto;
    }

    public int getHorasHistoriaPrincipal() {
        return horasHistoriaPrincipal;
    }

    public void setHorasHistoriaPrincipal(int horasHistoriaPrincipal) {
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }
}

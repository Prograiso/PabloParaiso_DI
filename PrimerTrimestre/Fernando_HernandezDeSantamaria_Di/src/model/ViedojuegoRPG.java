package model;

public class ViedojuegoRPG extends Videojuego{

    boolean munboAbierto;
    int horasHistoriaPrincipal;

    public ViedojuegoRPG() {
    }

    public ViedojuegoRPG(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamiento, double precio, boolean munboAbierto, int horasHistoriaPrincipal) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamiento, precio);
        this.munboAbierto = munboAbierto;
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 0;
        if (munboAbierto) precio+= getPrecio()+(getPrecio()*0.15);
        precio+= getPrecio()*((horasHistoriaPrincipal/10)*2)/100;
        return precio;
    }

    public boolean isMunboAbierto() {
        return munboAbierto;
    }

    public void setMunboAbierto(boolean munboAbierto) {
        this.munboAbierto = munboAbierto;
    }

    public int getHorasHistoriaPrincipal() {
        return horasHistoriaPrincipal;
    }

    public void setHorasHistoriaPrincipal(int horasHistoriaPrincipal) {
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }
}

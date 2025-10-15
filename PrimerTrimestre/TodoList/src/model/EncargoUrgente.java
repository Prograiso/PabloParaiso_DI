package model;

public class EncargoUrgente extends Encargos {

    private Persona dniResponsable;
    private int nivelUrgencia;

    public EncargoUrgente(int id, String titulo, boolean hecho, Persona dniResponsable, int nivelUrgencia) {
        super(id, titulo, hecho);
        this.dniResponsable = dniResponsable;
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public void mostrarDatosEncargo() {
        super.mostrarDatosEncargo();
        System.out.println("dniResponsable = " + dniResponsable);
        System.out.println("nivelUrgencia = " + nivelUrgencia);
    }

    @Override
    public String toString() {
        return super.toString() +
                "EncargoUrgente{" +
                "dniResponsable=" + dniResponsable +
                ", nivelUrgencia=" + nivelUrgencia +
                '}';
    }

    public Persona getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(Persona dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
}

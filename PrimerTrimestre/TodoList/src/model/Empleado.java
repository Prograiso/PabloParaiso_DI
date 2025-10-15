package model;

public class Empleado extends Persona{

    private String dniResponsable;

    public Empleado(){};

    public Empleado(String nombre, String apellido, String dni, int edad, String dniResponsable){
        super(nombre, apellido, dni, edad);
        this.dniResponsable = dniResponsable;
    }



    @Override
    public void mostrarDatosPersona() {
        super.mostrarDatosPersona();
        System.out.println("dniResponsable = " + dniResponsable);
    }


    @Override
    public String toString() {
        return super.toString() +
                "Empleado{" +
                "dniResponsable=" + dniResponsable +
                '}';
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }
}

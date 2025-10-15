package model;

import javax.lang.model.SourceVersion;

public class Responsable extends Persona {

    private int nivelResponsabilidad;

    public Responsable(){};

    public Responsable(String nombre, String apellido, String dni, int edad, int nivelResponsabilidad){
        super(nombre, apellido, dni, edad);
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public void mostrarDatosPersona() {
        super.mostrarDatosPersona();
           System.out.println("nivelResponsabilidad = " + nivelResponsabilidad);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Responsable{" +
                "nivelResponsabilidad=" + nivelResponsabilidad +
                '}';
    }

    public int getNivelResponsabilidad() {
        return nivelResponsabilidad;
    }

    public void setNivelResponsabilidad(int nivelResponsabilidad) {
        this.nivelResponsabilidad = nivelResponsabilidad;
    }
}

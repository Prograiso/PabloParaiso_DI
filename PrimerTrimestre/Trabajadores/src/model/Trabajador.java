package model;


abstract public class Trabajador extends Persona{


    private int nss, telefono;
    private double sueldo;
    private String correo;


    public Trabajador(){}

    public Trabajador(String dni, String nombre, String apellido, int edad,
                      int nss, int telefono, double sueldo, String correo) {
        super(dni, nombre, apellido, edad);
        this.correo=correo;
        this.nss = nss;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public Trabajador(int nss, int telefono, double sueldo, String correo) {
        this.nss = nss;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.correo = correo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nss = " + nss);
        System.out.println("telefono = " + telefono);
        System.out.println("sueldo = " + sueldo);
        System.out.println("correo = " + correo);
    }

   abstract public double calcularSalarioNeto();



    public int getNss() {
        return nss;
    }

    public int getTelefono() {
        return telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCorreo() {
        return correo;
    }


    public void setNss(int nss) {
        this.nss = nss;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

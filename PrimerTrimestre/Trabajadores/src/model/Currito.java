package model;

public class Currito extends Trabajador{
    private String ett;
    private double roboEtt;


    public Currito(){}

    public Currito(String dni, String nombre, String apellido, int edad, int nss, int telefono, double sueldo, String correo, String ett, double roboEtt) {
        super(dni, nombre, apellido, edad, nss, telefono, sueldo, correo);
        this.ett = ett;
        this.roboEtt = roboEtt;
    }

    @Override
    public double calcularSalarioNeto() {
       double salarioNeto = getSueldo() - roboEtt*12;
        return salarioNeto;}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ett = " + ett);
        System.out.println("roboEtt = " + roboEtt);
    }

    public String getEtt() {
        return ett;
    }

    public void setEtt(String ett) {
        this.ett = ett;
    }

    public double getRoboEtt() {
        return roboEtt;
    }

    public void setRoboEtt(double roboEtt) {
        this.roboEtt = roboEtt;
    }
}

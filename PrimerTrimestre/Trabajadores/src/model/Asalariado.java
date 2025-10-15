package model;

public class Asalariado extends Trabajador {
    private int npagas;
    private double irpf;


    public Asalariado() {
    }

    public Asalariado(String dni, String nombre, String apellido, int edad, int nss, int telefono, double sueldo, String correo, int npagas, double irpf) {
        super(dni, nombre, apellido, edad, nss, telefono, sueldo, correo);
        this.npagas = npagas;
        this.irpf = irpf;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("npagas = " + npagas);
        System.out.println("irpf = " + irpf);
    }

    @Override
    public double calcularSalarioNeto() {
        return   getSueldo() - (getSueldo() * irpf / 100);
    }

    public  void  calculoSalarioMensual(){
        double netoMes = calcularSalarioNeto()/npagas;
        System.out.println("El salario neto mensual es: " + netoMes);
    }
}



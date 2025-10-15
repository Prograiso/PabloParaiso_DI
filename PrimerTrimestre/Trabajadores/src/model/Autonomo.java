package model;

public class Autonomo extends Trabajador {

    private double cuotasSS;

    public Autonomo (){}

    public Autonomo(String dni, String nombre, String apellido, int edad, int nss, int telefono, double sueldo, String correo, double cuotasSS) {
        super(dni, nombre, apellido, edad, nss, telefono, sueldo, correo);
        this.cuotasSS = cuotasSS;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cuotaSS =" + cuotasSS);
    }

    @Override
    public double calcularSalarioNeto() {
        double salarioNeto = getSueldo() - cuotasSS*12;
        System.out.println("El salario neto anual es: " + salarioNeto);
        return salarioNeto;}

    public void aplicarDescuentoCuotas(int descuento){
        cuotasSS = cuotasSS - (cuotasSS * (double) descuento/100);
    }

    public double getCuotasSS() {
        return cuotasSS;
    }

    public void setCuotasSS(double cuotasSS) {
        this.cuotasSS = cuotasSS;
    }


}


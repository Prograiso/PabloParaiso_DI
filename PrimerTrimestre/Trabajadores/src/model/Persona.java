package model;

abstract public class Persona {
    private String dni, nombre, apellido;
    private int edad;

    public Persona(){}

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

   public void mostrarDatos(){
       System.out.println("dni = " + dni);
       System.out.println("nombre = " + nombre);
       System.out.println("apellido = " + apellido);
       System.out.println("edad = " + edad);
   }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

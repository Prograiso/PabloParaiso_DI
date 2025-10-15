package model;

public abstract class Persona {

    private String nombre,apellido,dni;
    private int edad;

    public Persona(){} // el constructor vacío se crea siempre xsiakasoo

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getDni(){  // getter se usa para obtener el valor, tiene return
       return dni;
    }
    public void setDni(){  //setter se usa para modificar el valor, NO tiene return, se pone void
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
     public void setNombre(){
        this.nombre = nombre;
     }

     public String getApellido(){
        return apellido;
     }
     public void setApellido(){
        this.apellido = apellido;
     }

     public int getEdad(){
        return edad;
     }
     public void setEdad(){
        this.edad = edad;
     }

     public void mostrarDatosPersona(){
         System.out.println("nombre = " + nombre);
         System.out.println("apellido = " + apellido);
         System.out.println("nombre = " + dni);
         System.out.println("edad = " + edad);
     }

    @Override
    public String toString() {
        return """
                Persona{
                nombre: %s
                apellido: %s
                dni: %s
                edad: %d
                }""".formatted(nombre, apellido, dni, edad);
    }
}

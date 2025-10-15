package model;

public class Usuario {

    //atributos de Usuario
    private int id;
    private String nombre;
    private int edad;

    //constructor vacio
    public void Usuario(){}

    //constructor generate con todos los atributos
    public Usuario(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos de clase Usuario

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
    }

    //metodo toString generado muestra datos de Uuario
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    //get generado
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    //set generado
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}

package model;

import java.util.ArrayList;
import java.util.Objects;

public class Tarea {

    // variables
    private int id, horasEmpleadas;

    private String descripcion, titulo;

    private Persona responsable;

    private Persona[] equipoTrabajo;

    private boolean completada;

    private ArrayList<Encargos> encargos;



    public Tarea() { // este es el vacio, desaparece cuando se escribe otro constructor
    }


    public Tarea( int id, String titulo, String descripcion,  Persona responsable, int horasEmpleadas) {
        this.id = id;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.completada = completada;
        this.horasEmpleadas = horasEmpleadas;
        this.responsable = responsable;
        equipoTrabajo = new Persona[4];
        encargos = new ArrayList<>();
    }

    public void mostrarDatosTarea() {
        System.out.println("id = " + id);
        System.out.println("horasEmpleadas = " + horasEmpleadas);
        System.out.println("descripcion = " + descripcion);
        System.out.println("titulo = " + titulo);
        System.out.println("responsable = " + responsable);
        System.out.println("completada = " + completada);
    }

   //getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorasEmpleadas() {
        return horasEmpleadas;
    }

    public void setHorasEmpleadas(int horasEmpleadas) {
        this.horasEmpleadas = horasEmpleadas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public Persona[] getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(Persona[] equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public ArrayList<Encargos> getEncargos() {
        return encargos;
    }

    public void setEncargos(ArrayList<Encargos> encargos) {
        this.encargos = encargos;
    }

    @Override
    public String toString() {
       return this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return id == tarea.id && horasEmpleadas == tarea.horasEmpleadas && completada == tarea.completada && Objects.equals(descripcion, tarea.descripcion) && Objects.equals(titulo, tarea.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, horasEmpleadas, descripcion, titulo, completada);
    }






// crear una clase llamada persona que tenga los
// atributos de: nombre, apellido, dni y edad
// Todos los atributos serán necesarios

// quiero que una tarea tenga un responsable asignado
// es imposible crear una tarea si no tiene responsable

// una tarea tiene hueco para 4 personas del equipo
// inicialmente la tarea no tiene personas en el equipo asignadas

// Agregar una persona al equipo de trabajo
// Si no tengo hueco, saltara un aviso
// Si intento agregar una persona al equipo de
// trabajo con un DNI ya existente
// saltará un aviso
// en caso de agregar saltar un aviso de todo OK

// crear un metodo para mostrar todos los datos de
// las personas del equipo de trabajo
// en caso de tener una persona null no mostrará nada

// Eliminar una persona del equipo de trabajo
// para ello el metodo pedirá un dni
// en caso de tener el dni en la lista, igualara a null su posicion->aviso
// en caso de no estar en la lista, saltará un aviso

// crear un metodo para poder agregar encargos en la tarea
// no pueden existir encargos con el mismo ID
// en todos los casos se mostrará un aviso del resultado del proceso
}

package controller;

import model.*;

import java.util.ArrayList;

public class OrganizadorTareas {

    private ArrayList<Tarea> listaTareas = new ArrayList<>();
    private ArrayList<Encargos> listaEncargos = new ArrayList<>();
    private Persona[] equipoTrabajo = new Persona[4];
    private ArrayList<Encargos> encargos = new ArrayList<>();


    //METODOS MENU PERSONA


    // metodo para ver si ya esta esa persona compararando dni
    private Persona estaPersona(String dni){

        for (int i = 0; i < equipoTrabajo.length; i++) {
            if(equipoTrabajo[i] != null
                    && equipoTrabajo[i].getDni().equalsIgnoreCase(dni)) {

                return equipoTrabajo[i]; //devolvemos la persona cuyo dni coincide
            }
        }
        return null;
    }
    public void añadirPersonaEquipo(Empleado persona){
        Persona estaPersona = estaPersona(persona.getDni());
        for (int i = 0; i < equipoTrabajo.length ; i++) {
            if (equipoTrabajo[i] == null && estaPersona == null) {
                equipoTrabajo[i] = persona;
                System.out.printf("Agregado correctamente persona con nombre %s%n",persona.getNombre());
                return;
            }
        }
        System.out.println("No se ha podido agregar");
    }

    public void mostrarEquipoTrabajo(){
        for(Persona persona : equipoTrabajo){
            if(persona != null){
                persona.mostrarDatosPersona();
            }
        }

    }

    public void eliminarPersona(String dni){
        for (int i = 0; i < equipoTrabajo.length; i++) {
            if(equipoTrabajo[i] != null &&
                    equipoTrabajo[i].getDni().equalsIgnoreCase(dni)){
                System.out.printf("Eliminado correctamente %s %n con dni: %s " + equipoTrabajo[i].getNombre(),dni);
                equipoTrabajo[i] = null;
            }
            else {
                System.out.println("Dni no encontrado");
            }
        }
    }

    //METODOS MENU ENCARGOS
    //comprobamos que no haya encargo con mismo id
    private Encargos estaEncargo(int id){
        for (Encargos encargo : encargos) {
            if(encargo.getId() == id){
                return encargo;
            }
        }
        return null;
    }

    //Mostrar un solo encargo
    //para ello se pasa el id del encargo y se muestra su info
    // si no esta se muetra un aviso
    public void mostrarUnEncargo(int id){
        Encargos encargoEncontrado = estaEncargo(id);
        if(encargoEncontrado != null){
            System.out.println(encargoEncontrado);
        } else {
            System.out.println("No se ha encontrado el encargo");
        }
    }


    //metodo para agregar un Encargo a la lista de encargos, no se podran meter encargos con id duplicado
    public void agregarEncargoTarea(Tarea tarea, Encargos encargo) {

        for (Encargos e : tarea.getEncargos()) {
            if (e.getId() == encargo.getId()) {
                System.out.println("El encargo ya existe en la tarea");
                return;
            }
        }
        tarea.getEncargos().add(encargo);
        System.out.println("Encargo agregado correctamente a la tarea");
    }

    //crear metodo que muestre la info de todos los encargos de la tarea
    // en caso de estar vacia saltar un aviso
    public void mostrarEncargos(){
        if(this.encargos.isEmpty()){
            System.out.println("No hay encargos");
        } else {
            for (Encargos item : this.encargos) {
                System.out.println(item);
            }
        }
    }

    public void eliminarEncargo(int id){
        Encargos encargoEncontrado = estaEncargo(id);
        if(encargoEncontrado!=null){
            encargos.remove(encargoEncontrado);
        } else {
            System.out.println("No hay encargo con ese ID");
        }
    }


    public void mostrarEncargosUrgentes() {
        for (Encargos encargo : encargos) {
            if (encargo.getClass() == EncargoUrgente.class) {
                ((EncargoUrgente) encargo).mostrarDatosEncargo();
            }
        }
    }/*  GETCLASS existe en todas las clases de Java porque lo heredan de
     la clase base Object, que es la raíz de toda la
     jerarquía de clases en Java. */


    // crear un metodo que permita completar un encargo, Para eñlo se pedira un id
    // y dicho encargo quedará completado
    public void completarEncargo(int id){
        Encargos encargoEncontrado = estaEncargo(id);
        if(encargoEncontrado != null){
            encargoEncontrado.setHecho(true);
            System.out.println("Encargo completado");
        } else {
            System.out.println("No se ha encontrado el encargo");
        }
    }



    //realizar metodo que permita marcar como realizada una tarea
    //una tarea se completa cuando todos sus encargos estan hechos
    public void completarTarea(Tarea tarea) {
        for (Encargos encargo : tarea.getEncargos()) {
            if (!encargo.iscompletado()) {
                System.out.println("No se puede completar la tarea, hay encargos pendientes");
                return;
            }
        }
        tarea.setCompletada(true);
        System.out.println("Tarea completada correctamente");
    }

    //mostrar encargos pendientes, se mostará la información de los encargos de una tarea
    //que no están completos
    public void mostrarEncargosPendientesDeUnaTarea(Tarea tarea) {
        for (Encargos encargo : tarea.getEncargos()) {
            if (!encargo.iscompletado()) {
                System.out.println(encargo);
            }
        }
    }


    public void mostrarTareasPendientes() {
        for (Tarea tarea : listaTareas) {
            if (!tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }
    }
}

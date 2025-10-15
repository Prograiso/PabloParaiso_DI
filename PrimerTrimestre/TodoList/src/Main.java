import controller.OrganizadorTareas;
import model.*;

import java.util.Scanner;

//JUEGA CON LAS CLASES Y LAS LLAMADAS AL MAIN DE LOS CONSTRUCTORES Y DEJALO BIEN
public class Main {
    public static void main(String[] args) {

        OrganizadorTareas organizador  = new OrganizadorTareas();

        // Empleados
        Empleado empleado1 = new Empleado("Juan", "Pérez", "12345678A", 28, "1111111A");
        Empleado empleado2 = new Empleado("Ana", "García", "23456789B", 32, "2222222B");
        Empleado empleado3 = new Empleado("Luis", "Martínez", "34567890C", 25, "3333333C");

        // Responsables
        Responsable responsable1 = new Responsable("Marta", "López", "45678901D", 40, 5);
        Responsable responsable2 = new Responsable("Carlos", "Sánchez", "56789012E", 38, 4);
        Responsable responsable3 = new Responsable("Laura", "Fernández", "67890123F", 35, 3);


        //Encargos
        Encargos encargo1 = new Encargos(1, "Preparar informe", false);
        Encargos encargo2 = new Encargos(2, "Revisar documentación", false);
        Encargos encargo3 = new Encargos(3, "Actualizar base de datos", false);

        EncargoUrgente encargoUrgente1 = new EncargoUrgente(4, "Aprender JAVA", false, responsable1, 2);
        EncargoUrgente encargoUrgente2 = new EncargoUrgente(5, "Aprender KOTLIN", false, responsable2, 3);

        // Tareas
        Tarea tarea1 = new Tarea(1, "Desarrollar aplicación", "Crear una aplicación de gestión de tareas", responsable1, 10);
        Tarea tarea2 = new Tarea(2, "Diseñar base de datos", "Diseñar la estructura de la base de datos", responsable2, 8);


        Scanner leerDato = new Scanner(System.in);
        int opcion ;
        do{
            System.out.println("""
                    ===============  MENU  ===============
                    1.  Agregar Persona al Equipo de Trabajo
                    2.  Eliminar Persona del Equipo de Trabajo
                    3.  Mostrar Equipo de Trabajo
                    4.  Agregar Encargos
                    5.  Ver Encargos Urgentes
                    6.  Mostrar un Encargo
                    7.  Completar Encargo
                    8.  Mostrar tareas pendientes
                    9.  Mostrar tareas completadas
                    10. Completar Tarea
                    11. Salir
                    =========================================
                    Elige una opcion:  """);
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion){
                case 1:
                    organizador.añadirPersonaEquipo(empleado1);
                    break;
                case 2:
                    System.out.println("Introduce el dni a eliminar:");
                    String dni = leerDato.toString();
                    organizador.eliminarPersona(dni);
                    break;
                case 3:
                    organizador.mostrarEquipoTrabajo();
                    break;
                case 4:
                    organizador.agregarEncargoTarea(tarea1, encargo1);
                    organizador.agregarEncargoTarea(tarea2,encargoUrgente2);
                    break;
                case 5:
                    organizador.mostrarEncargos();
                    organizador.mostrarEncargosUrgentes();
                    break;
                case 6:
                    System.out.println("Introduce el id del encargo a mostrar:");
                    int idEncargo = leerDato.nextInt();
                    organizador.mostrarUnEncargo(idEncargo);
                    break;
                case 7:
                    System.out.println("Introduce id para completar Encargo:");
                    int idCompletar = leerDato.nextInt();
                    organizador.completarEncargo(idCompletar);
                    break;
                case 8:
                    organizador.mostrarEncargosPendientesDeUnaTarea(tarea1);
                    break;
                case 9:
                    organizador.mostrarTareasPendientes();
                    break;
                case 10:
                    organizador.completarTarea(tarea2);
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(opcion != 11);

//        Tarea tareaTerciaria = new Tarea(2, "Aprender POO", "Estudiar la programación orientada a objetos en Java",new  Persona());
//
//        tareaSecundaria.setTitulo("Aprender Java y POO");
//        System.out.println( tareaSecundaria.getTitulo());
//
//        Tarea equipoTrabajo = new Tarea();
//
//
//        Persona persona1 = new Persona("Pepe", "Garcia", "12345678A", 30);
//        new Persona("Maria", "Lopez", "87654321B", 25);
    }


}

package model;

import java.util.ArrayList;

public class Biblioteca {

    //atributos biblioteca
    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Prestamo> listaPrestamos;

    //constructor vacio
    public  Biblioteca() {}

    //constructor generado con todos los atributos de Biblioteca
    public Biblioteca(ArrayList<Libro> listaLibros,
                      ArrayList<Usuario> listaUsuarios,
                      ArrayList<Prestamo> listaPrestamos) {
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
        this.listaPrestamos = listaPrestamos;
    }

    //METODOS LIBRO -------------------------------------------

    //para saber si está un libro
    private Libro estaLibro(int id){
        for (Libro libro:listaLibros) {
            if (libro.getId()==id){
                return libro;
            }
        }return null;//si no está retorna null
    }

    //para agregar sin permitir duplicados
    public void agregarLibro(Libro libro){
        if(estaLibro(libro.getId())==null){
            listaLibros.add(libro);
            System.out.printf("Libro agregado correctamente \n");
        } else {
            System.out.printf("Este libro ya está en la lista \n");
        }
    }

    //eliminar libro
    public void eliminarLibro(Libro libro) {
        if (estaLibro(libro.getId()) != null) { //esto es si el libro está
            listaLibros.remove(libro);
            System.out.println("libro eliminado \n");//borramos ese libro
        } else { //y sino avisamos de que no está
            System.out.printf("El libro no esta en la lista \n");
        }
    }

    //para mostar cada libro de la lista de libros
    public void mostrarListaLibros()
    {
        if (listaLibros.isEmpty()) {
            System.out.println("La lista de libros está vacia \n");
        } else {
            for(Libro libro : listaLibros){
                libro.mostrarDatos();
            }
        }
    }

    //METODOS USUARIO -------------------------------------------------

    private Usuario estaUsuario(int id){
        for(Usuario usuario : listaUsuarios){
            if(usuario.getId() == id){
            return usuario;
        }
    }return null;
    }

    public void agregarUsuario(Usuario usuario){
        if(estaUsuario(usuario.getId()) == null){
            listaUsuarios.add(usuario);
            System.out.print("Usuario añadido \n");
        } else {
            System.out.println("Usuario ya esta en la lista \n");
        }
    }

    public void eliminarUsuario(int idUsuario){
        Usuario usuario = estaUsuario(idUsuario);
        if(usuario != null){
            listaUsuarios.remove(usuario);
            System.out.println("Usuario eliminado\n");
        } else{
            System.out.println("Usuario no está en la lista \n");
        }
    }

    public void mostrarUsuarios(){
        if(listaUsuarios.isEmpty()){
            System.out.println("lista de usuarios vacia \n");
        } else{
            for(Usuario usuario : listaUsuarios){
                usuario.mostrarDatos();
            }
        }
    }

    //METOSDOS PRESTAMO

    private Prestamo estaPrestamo(int id){
        for(Prestamo prestamo : listaPrestamos){
            if(prestamo.getId() ==id){
                return  prestamo;
            }
        }return  null;
    }

    public Prestamo crearPrestamo(int idLibro, int idUsuario){
        Libro libro = estaLibro(idLibro);
        Usuario usuario = estaUsuario(idUsuario);

        if(libro == null){
            System.out.printf("Id libro no existe");
        return null;
        }

        if(usuario == null){
            System.out.println("id usuario no existe");
        return null;
        }

        int idPrestamo = listaPrestamos.size()+1;
         Prestamo prestamo = new Prestamo(idPrestamo,libro,usuario);
         listaPrestamos.add(prestamo);

         return prestamo;
    }


    //toString generado
    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                ", listaUsuarios=" + listaUsuarios +
                ", listaPrestamos=" + listaPrestamos +
                '}';
    }

    //get generado
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    //set generado
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}

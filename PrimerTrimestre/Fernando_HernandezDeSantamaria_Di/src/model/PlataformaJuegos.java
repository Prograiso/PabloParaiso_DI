package model;

import java.util.ArrayList;

public class PlataformaJuegos {
    ArrayList<Videojuego> listaVideojuegos;
    public PlataformaJuegos(){
        listaVideojuegos= new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego videojuego){
        listaVideojuegos.add(videojuego);
    }
    public void eliminarVideojuego(Videojuego videojuego){
        listaVideojuegos.remove(videojuego);
    }

    public void mostrarTodoslosjuegos(){
        if (!listaVideojuegos.isEmpty())
            for (Videojuego videojuego: listaVideojuegos){
                System.out.println(videojuego);
            }
        else System.out.println("No hay juegos en la lista");
    }

    public void mostrarPorCalificacionDeEdad(String calificacionDeEdad){
        System.out.println("Estos son los juegos de esa clasificación de edad:");
        if (!listaVideojuegos.isEmpty())
        for (Videojuego videojuego: listaVideojuegos){
            if (calificacionDeEdad == videojuego.getClasificacionEdad()) System.out.println(videojuego);
        }
        else System.out.println("No hay juegos en la lista");
    }
    public void mostrarPorTitulo(String titulo){
        if (!listaVideojuegos.isEmpty())
            for (Videojuego videojuego: listaVideojuegos){
                if (videojuego.getTitulo()==titulo){
                System.out.println(videojuego);
                return;
                }
            }
        else System.out.println("No hay juegos en la lista");
    }

    public  double  precioTotal(){
        double precio= 0;
        for (Videojuego videojuego: listaVideojuegos){
            precio+= videojuego.calcularPrecioFinal();
        }
        return precio;
    }

    public void mostrarDeMasCaroaMasBarato(){
        listaVideojuegos.stream().sorted();
        mostrarTodoslosjuegos();
    }

}

package controller;

import model.Videojuego;
import model.VideojuegoAccion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlataformaVideojuegos {

  private ArrayList<Videojuego> listaVideojuegos;
  private int caja;


  public PlataformaVideojuegos(){}

    public PlataformaVideojuegos(ArrayList<Videojuego> listaVideojuegos, int caja) {
        this.listaVideojuegos = listaVideojuegos;
        this.caja = caja;
    }






    @Override
    public String toString() {
        return "PlataformaVideojuegos{" +
                "listaVideojuegos=" + listaVideojuegos +
                ", caja=" + caja +
                '}';
    }

    public ArrayList<Videojuego> getListaVideojuegos() {
        return listaVideojuegos;
    }

    public void setListaVideojuegos(ArrayList<Videojuego> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }
}

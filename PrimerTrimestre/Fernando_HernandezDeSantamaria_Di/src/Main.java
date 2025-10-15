import model.PlataformaJuegos;
import model.VideojuegoAccion;
import model.VideojuegoEstrategia;
import model.ViedojuegoRPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VideojuegoAccion accion1 = new VideojuegoAccion("Call of Duty","Activision","18",2010,60.0,4,true);
        VideojuegoAccion accion2 = new VideojuegoAccion("Battelfield","Activision","16",2010,90.0,5,false);
        VideojuegoEstrategia estrategia1 = new VideojuegoEstrategia("Assasin creed","Ubisoft","16",2010,90.0,6,80);
        VideojuegoEstrategia estrategia2 = new VideojuegoEstrategia("Farcry","Ubisoft","18",2010,40.0,4,100);
        ViedojuegoRPG rpg1 = new ViedojuegoRPG("GTA V","Rock Stars","18",2010,150.0,true,200);
        ViedojuegoRPG rpg2 = new ViedojuegoRPG("GTA IV","Rock Stars","18",2000,50.0,false,40);

        PlataformaJuegos plataformaJuegos = new PlataformaJuegos();
        plataformaJuegos.agregarVideojuego(accion1);
        plataformaJuegos.agregarVideojuego(accion2);
        plataformaJuegos.agregarVideojuego(estrategia1);
        plataformaJuegos.agregarVideojuego(estrategia2);
        plataformaJuegos.agregarVideojuego(rpg1);
        plataformaJuegos.agregarVideojuego(rpg2);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    MENU:
                    1.Ver todos los juegos disponibles
                    2.Filtrar juegos por tipo (Acción, Estrategia, RPG)
                    3.Filtrar juegos por clasificación de edad
                    4.Ver detalles de un juego específico
                    5.Calcular el precio total de todos los juegos
                    6.Salir del programa
                    opción:""");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:{
                    System.out.println("Estos son todos los videojuegos: ");
                    plataformaJuegos.mostrarTodoslosjuegos();
                    break;
                }
                case 2:{

                }
                case 3:{
                    System.out.println("¿Por qué categoría de edad?: ");
                    String edad = sc.toString();
                    plataformaJuegos.mostrarPorCalificacionDeEdad(edad);
                    break;
                }
                case 4:{
                    String titulo = sc.nextLine();
                    plataformaJuegos.mostrarPorTitulo(titulo);
                    break;

                }
                case 5:{
                    System.out.println("El precio total de los videojuegos es: " + plataformaJuegos.precioTotal());
                    break;
                }
                case 6:{
                    return;
                }
                default: {
                    System.out.println("No ha seleccionado ninguna opción.");
                    break;
                }
            }
        }
    }
}

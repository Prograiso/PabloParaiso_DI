import model.Asalariado;
import model.Persona;
import model.Trabajador;

public class Main {
    public static void main(String[]args){

//        Persona persona = new Persona("12345678A", "Juan", "Perez", 30);
//        persona.mostrarDatos();

        //persona y trabajador lo comento por fallo al marcar abstracto
        //Trabajador trabajador = new Trabajador("87654321B", "Ana", "Gomez", 28,
        //                               123456789, 600123456, 2500.50, "papigmail.com");
        //trabajador.mostrarDatos();

    Asalariado asalariado = new Asalariado("87654321B", "Ana", "Gomez", 28,
            123456789, 600123456, 2500.50, "papigmail.com", 14, 15);
    asalariado.mostrarDatos();
    asalariado.calculoSalarioMensual();

    Asalariado asalariado2 = new Asalariado("12345b", "Luis", "Martinez", 35,
            987654321, 600654321, 3000.75, "luisgmail.com", 12, 18);


}
}

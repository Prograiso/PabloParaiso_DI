
import java.util.Scanner;

public class Entrada {
    //variables
    final String DNI = "12345678A"; //constante por "final"
    String nombre = "Juan"; // cl
    char letra = 'A';

    int numero = 34; //tipo primitivo
    Integer numero2 = 45; //clase envolvente compleja

    double altura = 12.25;
    float peso = 12.25f;


    //constructores

    //metodos

    //fun main(args:Array<String>) {}


    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in); //para leer por teclado
        System.out.println("Por favor, introduce tu nombre: ");//mensaje por pantalla con salto de linea
        String nombre = lecturaTeclado.next(); //lee una cadena de texto hasta el primer espacio
        System.out.println("Por favor, introduce tu edad: ");
        int edad = lecturaTeclado.nextInt(); //lee un entero por teclado
        System.out.println("Primer Programa de Java");
        System.out.println("mi nombre es "+nombre);
        System.out.printf("Mi nombre es %s %ny tengo %d",nombre,edad); //formateo de cadenas

    }

}

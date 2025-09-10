
import java.util.Scanner;

public class Entrada {
    //variables
    final String DNI = "12345678A";
    String nombre = "Juan";
    char letra = 'A';

    int numero = 34; //tipo primitivo
    Integer numero2 = 45; //clase envolvente compleja

    double altura = 12.25;
    float peso = 12.25f;


    //constructores

    //metodos

    //fun main(args:Array<String>) {}


    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre: ");
        String nombre = lecturaTeclado.next();
        System.out.println("Por favor, introduce tu edad: ");
        int edad = lecturaTeclado.nextInt();
        System.out.println("Primer Programa de Java");
        System.out.println("mi nombre es "+nombre);
        System.out.printf("Mi nombre es %s y %n tengo %d",nombre,edad);

    }

}

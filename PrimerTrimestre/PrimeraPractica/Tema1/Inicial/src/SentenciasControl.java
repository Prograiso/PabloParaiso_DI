import java.util.Scanner;

public class SentenciasControl {

    //variables
    //constructores -> ()
    //metodos

    //fun nombreFuncion ():retorno {
    //}


    public void sentenciasCondicionalesSwitch(){
        int nota = 10;
        char letra = 'A';
        String palabra = "asdasd";

        switch (letra) {
        }
        }

        public void sentenciasRepeticionFor(){
            int [] elementos = {1,2,3,4,5,6,7};
            int [] [] elementosMulti = {{1,2,3},{4,5,6},{7,8,9}};
            String [] palabras = {"hola","que","tal"};
            Object [] cosas = {1,true,"hola",'6'};

            /*for (int i = 0; i < elementos.length; i++) {
                System.out.println(elementos[i]);
            }*/

            for (String item : palabras) {
                System.out.println(item);
            }
        }

        public void tablasMultiplicar(){

        for (int i = 0; i < 11; i++) {System.out.println("Tabla del " + i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t%d x %d = %d\n",i,j,i*j);
            }

        }

        }

        public void sentenciasRepeticionSwitch(){
        System.out.print("Selecciona la opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Has seleccionado la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
                break;
            }
        }
}

import java.util.Random;

public class EstructurasArrays {

    private int[] numeros = new int[9];

    public void inclurNumero(int posicion, int valor) {
        if (posicion > numeros.length-1){
            System.out.print("Posición no válida, fallo");
        } else{
            numeros[posicion]= valor;
        }

    }

    public void  mostrarDatosArray(){//esto es un foreach
        for (int valor : numeros) {
            System.out.printf("valor: %d\n",valor);
        }
    }

    public  void buscarNumero(int numero){
       int repetido = 0;

        for (int valor: numeros) {
            if (valor == numero){
                repetido++;
                System.out.printf("El valor %d se repite %d en el array\n",numero,repetido);
            }
        }
    }

    public boolean estaNumero(int numeroBuscado){

        for (int valor: numeros) {
            if (valor == numeroBuscado){
                return true;
            }
        } int aleatorio = (int) (Math.random()*41); //castea a int el double
        return false;
    }
    //CASTEO : CAMBIO DE DATOS DIRECTO
    //PARSEO: CONVERSION DE DATOS


    public void llenarArray(){

        for (int i=0 ; i < numeros.length; i++){
            numeros[i] = (int) (Math.random()*41); //castea a int el double
        }
    }
//pbtener la suma de todos los valores del array
//el numero medio generado -> decimal
//el numero maximo generado
    //el minimo generado

    public void sumaMaxMinMedio(){
         int suma = 0;
         int menor = numeros[0];
         int mayor = 0;
       for(int item : numeros){
        suma += item;
        if (item > mayor){
            mayor = item;
        }
        if (item < menor){
            menor = item;
        }

       }
         double media = (double) suma / numeros.length;
       System.out.println("la media es:" +media);
         System.out.println("el mayor es:" +mayor);
            System.out.println("el menor es:" +menor);

    }

    //girar el array a izquierdas y a derechas en un solo metodo

    public void girarArrayDerecha() {

        int ultimo = numeros[numeros.length - 1];//guardo el ultimo valor del array
        for (int i = numeros.length - 1; i > 0; i--) {//recorro el array desde el final hasta el principio
            numeros[i] = numeros[i - 1];//voy copiando el valor anterior en la posicion actual

        }
        numeros[0] = ultimo;//el primer valor del array ahora es el primero (posicion 0)
    }

    public void girarArrayIzquierda() {

        int primero = numeros[0];//guardo el primer valor del array
        for (int i = 0; i < numeros.length - 1; i++) {//recorro el array desde el principio hasta el final
            numeros[i] = numeros[i + 1];//voy copiando el valor siguiente en la posicion actual

        }
        numeros[numeros.length - 1] = primero;//el ultimo valor del array ahora es el primero (posicion 0)
    }
}

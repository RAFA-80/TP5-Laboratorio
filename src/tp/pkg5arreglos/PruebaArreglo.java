package tp.pkg5arreglos;

/**
 *
 * @author RAFAEL
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Arreglo simple
        int[] array = {2, 15, 23, 4, 53, 21, 91};
        //Arreglo bidimensional
        int[][] arrayBi = {{2, 5, 116, 55, 38}, {281, 82, 7}, {23, 1, 67, 100}};
        
        //Suma los numeros dentro del arreglo, luego saca el promedio.
        Arreglo.sumarLista(array);
        //Busca el numero mayor dentro del arreglo.
        Arreglo.buscarMayor(arrayBi);
        //Recibe una cadena y cuenta las vocales que hay dentro de esa cadena.
        Arreglo.cuentaVocales("Hola Estoy con java");
        //Recibe una cadena y un cracter, cuenta las veces que esta repetido el caracter dentro de la cadena.
        Arreglo.cuentaCaracter("Estoy contando caracteres", 's');

    }

}

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
        
        System.out.println("[Sumar los numeros dentro del arreglo, luego sacar el promedio.]");
        Arreglo.sumarLista(array);
        
        System.out.println("[Buscar el numero mayor dentro del arreglo.]");
        Arreglo.buscarMayor(arrayBi);
        
        System.out.println("[Contar las vocales que hay dentro de una cadena.]");
        Arreglo.cuentaVocales("Hola Estoy con java");
        
        System.out.println("[Contar las veces que esta repetido un caracter dentro de la cadena.]");
        Arreglo.cuentaCaracter("Estoy contando caracteres", 's');

    }

}

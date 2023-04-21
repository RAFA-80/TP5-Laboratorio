package tp.pkg5arreglos;

/**
 *
 * @author RAFAEL
 */
public class Arreglo {

    public static void sumarLista(int a[]) {
        int suma = 0, promedio = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }

        promedio = suma / a.length;

        System.out.println("La suma de los numeros dentro del arreglo es: " + suma);
        System.out.println("El promedio de los numeros dentro del arreglo es: " + promedio);
    }

    public static void buscarMayor(int a[][]) {
        int mayor = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > mayor) {
                    mayor = a[i][j];
                }
            }
        }
        System.out.println("El numero mayor dentro del arreglo es: " + mayor);

    }

    public static void cuentaVocales(String s) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int cont = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (s.charAt(i) == vocales[j]) {
                    cont++;
                }
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);

    }

    public static void cuentaCaracter(String s, char c) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cont++;
            }

        }

        System.out.println("El caracter esta repetido: " + cont + " veces.");
    }

}

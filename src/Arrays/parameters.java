package Arrays;

public class parameters {
    /**
     * Arreglos con parametros
     */

    public static void utilizarArreglo(int numeros[]) {
        numeros[4] = 0;
    }

    public static void main (String[] args) {
        int numeros[] = {1, 2, 3, 4, 5};
        utilizarArreglo(numeros);

        System.out.println(numeros[2]);

        // Otra forma de recorrer los for
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }

}

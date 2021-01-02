package Arrays.vectores;

/**
 * Programa que carga automáticamente en un vector las letras del abecedario indicando el tamaño del vector en una constante.
 */

public class Main {

    public static void main (String[] args) {
        final int WIDTH = 26;
        char[] listaLetras = new char[WIDTH];
        char letra = 'A';

        //Asignación de letras a cada elemento del vector
        for(int i=0; i<WIDTH; i++) {
            listaLetras[i] = letra;
            letra++;
        }

        //Mostrar en pantalla el vector
        for(int i=0; i<WIDTH; i++) {
            System.out.print(listaLetras[i]+" ");
        }
    }

}

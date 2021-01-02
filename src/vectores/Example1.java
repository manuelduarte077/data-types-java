package vectores;

/**
 * Programa que muestra diversos elementos de un vector
 */

public class Example1 {

    public static void main(String[] args) {
        int[] edades = {26, 73, 84, 52, 76, 72, 37, 67, 62, 73};

        //Mostrar el primer elemento
        System.out.println(edades[0]);

        //Mostrar el último elemento
        System.out.println(edades[edades.length - 1]);

        //Cambiar el tercer valor y mostrarlo
        edades[2] = 48;
        System.out.println(edades[2]);

        //Mostrar todo el vector
        for (int i = 0; i < edades.length; i++) {
            System.out.print(edades[i] + " ");
        }
        System.out.println();

        //Mostrar todo el vector de otra forma
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
    }

}

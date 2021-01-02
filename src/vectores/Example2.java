package vectores;

/**
 * Programa que muestra el número de apuestas que son necesarias para que se acierten 6 números dados en la lotería primitiva.
 */

public class Example2 {

    public static void main(String[] args) {

        int[] apuesta = {22, 28, 3, 13, 40, 7};
        int aciertos, bola, apuestas = 0;

        do {
            aciertos = 0;
            apuestas++;
            for (int i = 0; i < 6; i++) {
                bola = (int) (Math.random() * 49) + 1;
                for (int j = 0; j < 6; j++) {
                    if (bola == apuesta[j])
                        aciertos++;
                }
            }
        } while (aciertos < 6);
        System.out.println("Apuestas realizadas: " + apuestas);
    }

}

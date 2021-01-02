package Listas.Listas_Enlazadas;

import java.util.concurrent.ThreadLocalRandom;

class Helper {

    static int[] lista_generica_valores ( int largo_cadena ) {
        int [] arreglo_base = new int[largo_cadena];
        for ( int n =0; n<largo_cadena;n++ ) {
            arreglo_base[n] = ThreadLocalRandom.current().nextInt(0, 100000 + 1);
        }
        return arreglo_base;
    }

}
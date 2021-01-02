package Matrices;

public class Matrices {

    public static void main (String[] args) {
        int[][] numeros = new int[4][4];
        int[][] datos = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16},
                        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < datos.length; j++ ) {
                System.out.println(datos[i][j]);
            }
        }

    }

}

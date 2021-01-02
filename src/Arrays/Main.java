package Arrays;

public class Main {

    public static void main(String[] args){

        int arreglo[];

        int numeros[] = new int[10]; // inicializando el arreglo, en 30
        numeros[9] = 1;
        numeros[8] = 2;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}

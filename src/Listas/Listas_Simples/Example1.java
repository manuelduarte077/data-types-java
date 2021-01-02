package Listas.Listas_Simples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

    public static void main (String[] args) {

//        Entonces… ¿cómo declaramos una lista? Pues seguimos la siguiente estructura:
//        List ejemploLista = new ArrayList();

        /**
         * Este tipo de lista puede almacenar cualquier tipo de dato, pero este enfoque ya ha quedado obsoleto.
         * Se prefiere que se designe el tipo de dato que se va a almacenar.
         * Entonces para declarar una lista donde guardaremos datos tipo String, hacemos lo siguiente:
         */

//        List<String> ejemploLista = new ArrayList<String>();
        /**
         * Con  nuestra lista creada podemos empezar a introducir datos en ella.
         *
         * Supongamos que queremos agregar los siguientes nombres: Juan, Pedro, José, María, Sofía.
         */

        // Hacemos lo siguiente:
        List<String> ejemploLista = new ArrayList<String>();
        ejemploLista.add("Juan");
        ejemploLista.add("Pedro");
        ejemploLista.add("José");
        ejemploLista.add("María");
        ejemploLista.add("Sofía");

        /**
         * Es posible además agregar el índice en el que queremos agregar dicho elemento.
         * Podemos obtener la cantidad de elementos que posee la lista:
         */
        ejemploLista.size();

        // para consultar la lista se utiliza
        ejemploLista.get(0);

        /**
         * Donde 0 es el índice en el que se encuentra la información que queremos. En este caso,
         * el índice 0 vendría siendo Pedro.
         *
         * Si queremos eliminar determinado elemento:
         */
        ejemploLista.remove(0);

        /**
         * Donde nuevamente el 0 representa el índice que queremos eliminar.
         * Otra forma de eliminar un registro es por su nombre:
         */
        ejemploLista.remove("Juan");

        /**
         * Si deseamos imprimir en consola los elementos de la lista:
         */
        System.out.println(ejemploLista);


        /**
         * También podemos imprimir todos los elementos de la lista de forma individual con la ayuda de un ciclo for.
         */
        for (int i = 0; i <= ejemploLista.size() - 1; i++) {
            System.out.println(ejemploLista.get(i));
        }

        /**
         * También podríamos usar un iterador para recorrer la lista e imprimir todos sus valores:
         */
        Iterator i = ejemploLista.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

       // Para eliminar todos los elementos de la lista usamos:
          // ejemploLista.clear();

        /**
         * Si deseamos saber si nuestra lista contiene algún elemento utilizamos:
         */
          // ejemploLista.isEmpty();

        /**
         * Esto nos devolverá un true o un false. En caso de que contenga algún elemento podemos verificar si entre esos
         * elementos tenemos alguno en específico. Por ejemplo si queremos saber si en nuestra lista está escrito el nombre
         * de José, utilizamos:
         */
        ejemploLista.contains("José");

        /**
         *  Esto también nos devolverá un true o un false. Y si por alguna razón queremos modificar algún dato de nuestra lista,
         *  por ejemplo el índice 1 que contiene el nombre de Pedro, utilizamos el siguiente método:
         */
        ejemploLista.set(1, "Félix");

        /**
         * Habremos cambiado el nombre en el índice 1 (Pedro) por el nuevo nombre (Félix).
         *
         * Si queremos extraer una lista que contenga los nombres entre un índice y otro podemos utilizar:
         */
        ejemploLista.subList(0, 2);
    }

}

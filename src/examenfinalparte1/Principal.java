package examenfinalparte1;

import java.io.IOException;

/**
 * Clase Principal.
 *
 * @author igonzalezcastro
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        /**
         * Inicializamos el primer objeto que aplica el primer cosntructor de la
         * claseOperaciones,a los valores que recibe.
         */
        ClaseOperaciones Constructor1 = new ClaseOperaciones(10, 20);
        /**
         * llamamos al objeto constructor1 y almacenamos el resultado en la
         * variable resultadoConstructor1
         */
        int resultadoConstructor1 = Constructor1.resultado;
        /**
         * visualizamos por consola el resultado del primer constructor.
         */
        System.out.println("Es: " + resultadoConstructor1);
        /**
         * Inicializamos un segundo objeto que aplica el segundo cosntructor de
         * la claseOperaciones,al valor que recibe.
         */
        ClaseOperaciones Constructor2 = new ClaseOperaciones(10);
        /**
         * llamamos al objeto constructor2 y almacenamos el resultado en la
         * variable resultadoConstructor2
         */
        int resultadoConstructor2 = Constructor2.resultado;
        /**
         * visualizamos por consola el resultado del segundo constructor.
         */
        System.out.println("Es: " + resultadoConstructor2);
        /**
         * Inicializamos el primer objeto que aplica el primer cosntructor de la
         * claseOperaciones.
         */
        ClaseOperaciones Constructor3 = new ClaseOperaciones();
        /**
         * llamamos al objeto constructor3 y almacenamos el resultado en la
         * variable resultadoConstructor3.
         */
        int resultadoConstructor3 = Constructor3.resultado;
        /**
         * visualizamos por consola el resultado del tercer constructor.
         */
        System.out.println("Es: " + resultadoConstructor3);
    }
}

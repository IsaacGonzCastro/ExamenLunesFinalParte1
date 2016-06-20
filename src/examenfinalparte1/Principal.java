package examenfinalparte1;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        ClaseOperaciones Constructor1 = new ClaseOperaciones(10, 20);
        int resultadoConstructor1 = Constructor1.resultado;
        System.out.println("Es: " + resultadoConstructor1);
        ClaseOperaciones Constructor2 = new ClaseOperaciones(10);
        int resultadoConstructor2 = Constructor2.resultado;
        System.out.println("Es: " + resultadoConstructor2);
        ClaseOperaciones Constructor3 = new ClaseOperaciones();
        int resultadoConstructor3 = Constructor3.resultado;
        System.out.println("Es: " + resultadoConstructor3);
    }
}

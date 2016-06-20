package examenfinalparte1;

public class ClaseOperaciones {

    int resultado;

    public ClaseOperaciones(int valor1, int valor2) {
        resultado = MetodoSumar(valor1, valor2);
    }

    public ClaseOperaciones(int valor) {
        resultado = MetodoSumar(valor, valor);
    }

    public ClaseOperaciones() {
        resultado = -1;
    }

    public int MetodoSumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}

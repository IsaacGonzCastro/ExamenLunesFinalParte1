package examenfinalparte1;

/**
 * Clase donde se realiza la operación de suma.
 *
 * @author igonzalezcastro
 */
public class ClaseOperaciones {

    /**
     * variable donde se almacena el resultado de las operaciones.
     */
    int resultado;

    /**
     * Constructor que suma dos valores que recibe por parametros.
     *
     * @param valor1 primer valor que recibe para sumar.
     * @param valor2 segundo valor que recibe para sumar.
     */
    public ClaseOperaciones(int valor1, int valor2) {
        resultado = MetodoSumar(valor1, valor2);
    }

    /**
     * Constructor que suma el valor que recibe por parametros consigo mismo.
     *
     * @param valor numero que recibe por paramaetros para sumarlo con el mismo.
     */
    public ClaseOperaciones(int valor) {
        resultado = MetodoSumar(valor, valor);
    }

    /**
     * Constructor vacio que iguala al valor de -1.
     */
    public ClaseOperaciones() {
        resultado = -1;
    }

    /**
     * Metodo que suma los numeros que recibe por parametros.
     *
     * @param numero1 primero numero que recibe por parametro para sumar.
     * @param numero2 segundo numero que recibe por parametro para sumar.
     * @return devuelve el resultado de la suma entre el numero1 y numero2.
     */
    public int MetodoSumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}

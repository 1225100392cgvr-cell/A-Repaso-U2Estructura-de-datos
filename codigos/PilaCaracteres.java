package codigos;

// Caso 1: Pila para revertir una cadena
public class PilaCaracteres {
    private char[] pila = new char[20];
    private int tope = -1;

    public void push(char c) {
        tope++;            // sube el tope
        pila[tope] = c;    // guarda el caracter arriba
    }

    public char pop() {
        char c = pila[tope]; // toma el de arriba
        tope--;              // baja el tope
        return c;
    }

    public String revertir(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            push(texto.charAt(i));
        }
        while (tope >= 0) {
            resultado += pop();
        }
        return resultado;
    }

    public static void main(String[] args) {
        PilaCaracteres p = new PilaCaracteres();
        System.out.println("HOLA -> " + p.revertir("HOLA"));
    }
}

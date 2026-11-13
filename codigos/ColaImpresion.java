package codigos;

// Caso 2: Cola para una fila de impresion
public class ColaImpresion {
    private String[] documentos = new String[10];
    private int frente = 0;
    private int fin = -1;

    public void encolar(String doc) {   // enqueue
        fin++;
        documentos[fin] = doc;
    }

    public String desencolar() {        // dequeue
        String doc = documentos[frente];
        frente++;
        return doc;
    }

    public void imprimirTodo() {
        while (frente <= fin) {
            System.out.println("Imprimiendo: " + desencolar());
        }
    }

    public static void main(String[] args) {
        ColaImpresion c = new ColaImpresion();
        c.encolar("Tarea");
        c.encolar("Examen");
        c.encolar("Boleta");
        c.imprimirTodo();
    }
}

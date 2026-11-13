package codigos;

// Caso 3: Lista para historial de navegacion
public class HistorialNavegacion {
    private String[] paginas = new String[15];
    private int tamanio = 0;

    public void add(String url) {
        paginas[tamanio] = url;
        tamanio++;
    }

    public void remove(String url) {
        for (int i = 0; i < tamanio; i++) {
            if (paginas[i].equals(url)) {
                // recorre a la izquierda las que siguen
                for (int j = i; j < tamanio - 1; j++) {
                    paginas[j] = paginas[j + 1];
                }
                paginas[tamanio - 1] = null;
                tamanio--;
                return;
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamanio; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion h = new HistorialNavegacion();
        h.add("escuela.edu");
        h.add("biblioteca.org");
        h.add("noticias.com");
        System.out.println("Antes de borrar:");
        h.mostrarHistorial();
        h.remove("biblioteca.org");
        System.out.println("Despues de borrar biblioteca.org:");
        h.mostrarHistorial();
    }
}

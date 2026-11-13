package codigos;
// Busqueda lineal y binaria
public class Busqueda {

    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            System.out.println("inicio=" + inicio + " fin=" + fin + " medio=" + medio + " valor=" + arr[medio]);
            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ids = {7, 13, 21, 34, 42, 55, 68, 79};
        System.out.println("Lineal: 68 esta en el indice " + busquedaLineal(ids, 68));
        System.out.println("Binaria:");
        System.out.println("68 esta en el indice " + busquedaBinaria(ids, 68));
    }
}

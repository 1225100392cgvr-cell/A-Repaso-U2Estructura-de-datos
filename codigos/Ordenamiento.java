package codigos;

import java.util.Arrays;

// Bubble Sort y QuickSort
public class Ordenamiento {

    
    public static void ordenar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    // Particion de QuickSort (pivote = ultimo elemento)
    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    // QuickSort completo
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fin);
        }
    }

    public static void main(String[] args) {
        int[] a = {42, 7, 19, 3, 25, 8, 15, 30};
        System.out.println("BUBBLE");
        ordenar(a);

        int[] b = {42, 7, 19, 3, 25, 8, 15, 30};
        int pos = particion(b, 0, b.length - 1);
        System.out.println("\nPrimera particion: " + Arrays.toString(b) + "  pivote en indice " + pos);

        int[] c = {42, 7, 19, 3, 25, 8, 15, 30};
        quickSort(c, 0, c.length - 1);
        System.out.println("QuickSort final: " + Arrays.toString(c));
    }
}

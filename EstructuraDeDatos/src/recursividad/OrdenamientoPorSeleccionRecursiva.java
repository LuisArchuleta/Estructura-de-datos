public class OrdenamientoPorSeleccionRecursiva {

    public static void ordenacionPorSeleccionRecursiva(int[] arr, int dd) {
        if (dd < arr.length - 1) {
            int indiceMinimo = encontrarIndiceMinimo(arr, dd, arr.length - 1);
            intercambiar(arr, dd, indiceMinimo);

            ordenacionPorSeleccionRecursiva(arr, dd + 1);
        }
    }

    private static int encontrarIndiceMinimo(int[] arr, int inicio, int fin) {
        int indiceMinimo = inicio;

        for (int i = inicio + 1; i <= fin; i++) {
            if (arr[i] < arr[indiceMinimo]) {
                indiceMinimo = i;
            }
        }

        return indiceMinimo;
    }

    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int dd = 0;

        System.out.println("Array original:");
        imprimirArray(arr);

        ordenacionPorSeleccionRecursiva(arr, dd);

        System.out.println("Array ordenado:");
        imprimirArray(arr);
    }

    private static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
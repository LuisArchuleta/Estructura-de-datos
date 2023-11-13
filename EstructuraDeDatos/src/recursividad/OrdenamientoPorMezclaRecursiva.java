public class OrdenamientoPorMezclaRecursiva {

    public static void ordenacionPorMezcla(int[] arr) {
        if (arr.length <= 1) {
            return;  // El array ya está ordenado o tiene un solo elemento
        }

        int medio = arr.length / 2;
        int[] mitadIzquierda = new int[medio];
        int[] mitadDerecha = new int[arr.length - medio];

        // Dividir el array en dos mitades
        System.arraycopy(arr, 0, mitadIzquierda, 0, medio);
        System.arraycopy(arr, medio, mitadDerecha, 0, arr.length - medio);

        // Llamadas recursivas para ordenar cada mitad
        ordenacionPorMezcla(mitadIzquierda);
        ordenacionPorMezcla(mitadDerecha);

        // Mezclar las dos mitades ordenadas
        mezclar(arr, mitadIzquierda, mitadDerecha);
    }

    private static void mezclar(int[] resultado, int[] izquierda, int[] derecha) {
        int i = 0, j = 0, k = 0;

        // Mezclar las dos mitades ordenadas en el array de resultado
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k] = izquierda[i];
                i++;
            } else {
                resultado[k] = derecha[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de las dos mitades, si los hay
        while (i < izquierda.length) {
            resultado[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < derecha.length) {
            resultado[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Array original:");
        imprimirArray(arr);

        ordenacionPorMezcla(arr);

        System.out.println("Array ordenado por mezcla:");
        imprimirArray(arr);
    }

    private static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
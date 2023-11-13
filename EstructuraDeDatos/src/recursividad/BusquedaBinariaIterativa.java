public class BusquedaBinariaIterativa {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorABuscar = 7;
        int indiceInicial = 0;
        int indiceFinal = arr.length - 1;

        int resultado = busquedaBinariaIterativa(arr, valorABuscar, indiceInicial, indiceFinal);

        if (resultado != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición " + resultado + ".");
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en el array.");
        }
    }
    public static int busquedaBinariaIterativa(int[] arr, int v, int i, int j) {
        while (i <= j) {
            int k = (i + j) / 2;  // Calcular la posición promedio

            if (arr[k] == v) {
                return k;  // Se encontró el valor, devolver la posición
            } else if (arr[k] < v) {
                i = k + 1;  // Descartar la mitad anterior a k
            } else {
                j = k - 1;  // Descartar la mitad posterior a k
            }
        }

        return -1;  // El valor no se encuentra en el array
    }
}
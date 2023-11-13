public class FibonacciIterativo {
    public static void main(String[] args) {
        long n=10;
        long resul=fibonacciIterativo(n);
        System.out.println("El término " + n + " de la secuencia de Fibonacci es: " + resul);
    }

    public static long fibonacciIterativo(long n) {
        if (n <= 1) {
            return n;
        }

        long fibNMinus2 = 0;
        long fibNMinus1 = 1;
        long fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }

        return fibN;
    }
}

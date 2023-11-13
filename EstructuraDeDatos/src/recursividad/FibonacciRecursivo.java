
public class FibonacciRecursivo {
    public static void main(String[] args) {
        long i=5    ;
        System.out.println("Fibonacci de "+i+"="+fb(i));
    
    }

    public static long fb(long n){
        if (n<=1)
            return 1;
        else
            
            return fb(n-1)+fb(n-2);
           
    }

}
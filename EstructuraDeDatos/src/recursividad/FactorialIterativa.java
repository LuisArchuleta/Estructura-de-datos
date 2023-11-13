
import java.util.Scanner;

public class FactorialIterativa {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Coloca n:");
        int n= leer.nextInt();
        factorialiterativo(n);
        leer.close();
    }

    public static long factorialiterativo(int n){
        long f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial de "+n+"!= "+f);
        return f;
    }
    
}


import java.util.Scanner;
public class FactorialRecursivo{
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Proporciona Numero:");
        int n=entrada.nextInt();
        long f=factorial(n);
        System.out.println("Factorial de "+n+"!= "+f);
        entrada.close();
    }

    public static long factorial(int n){
        if (n==0)
        return 1;
        else
        return factorial(n-1)*n;
    }
}
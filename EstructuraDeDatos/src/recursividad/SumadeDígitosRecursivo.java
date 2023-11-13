
import java.util.Scanner;
public class SumadeDígitosRecursivo {
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Coloca n:");
    int n= leer.nextInt();
    int suma=sumaRecursiva(n);
    System.out.println(suma);
    }

    public static int sumaRecursiva(int n) {
    if(n<=9)
    return n;
    else
    return 
    sumaRecursiva(n/10)+n%10;
    }
  
   
}

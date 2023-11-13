import java.util.Scanner;
public class SumadeDigitosIterativo {
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Coloca n:");
    int n= leer.nextInt();
    int suma=sumaIterativa(n);
    System.out.println(suma);
    }

    public static int sumaIterativa(int n) {
        int suma = 0;
        while(n>9)
        {
        suma = suma + n%10;
        n = n/10;
        }
        return (suma+n);
        }
        
  
   
}
package recursividad;

import java.util.Scanner;

public class MuestraNaturaesRecursivo {
    public static void main(String[] args) {
          Scanner leer= new Scanner(System.in);
        System.out.println("Coloca n:");
        int n= leer.nextInt();
        muestraNaturalesRecursivo(n);
    }
    public static void muestraNaturalesRecursivo(int n){
        if(n>0){
            
        muestraNaturalesRecursivo(n-1);
        System.out.print(n+" ");
        
        }
        
    }
}

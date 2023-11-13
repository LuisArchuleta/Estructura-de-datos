
import java.util.Scanner;
public class MuestraNaturalesR{
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Coloca n:");
        int n= leer.nextInt();
        muestraNaturalesIterativos(n);
        leer.close();
    }

    public static void muestraNaturalesIterativos(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i+"");
        }

    }

}
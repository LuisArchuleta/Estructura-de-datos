
public class AlfabetoRecursivo {
    public static void main(String[] args) {
        System.out.println();
        metodoA('Z');
    }
    public static void metodoA(char c){
        if (c>'A') 
            metodoB(c);
        System.out.print(c+" ");
        
    }
    public static void metodoB(char c){
        metodoA(--c);
    }
}

public class AlfabetoIterativo {
    public static void main(String[] args) {
        alfabetoiterativo('A');
    }

    public static void alfabetoiterativo(char c){
        while(c<'Z'){
            System.out.print(c+" ");
            c++;
        }
    }

}

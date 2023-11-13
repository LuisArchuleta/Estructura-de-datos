public class mcdIterativa {
    public static void main(String[] args) {
      int dividendo= mcd(124,6);
      System.out.println(dividendo);
    }
    
    public static int mcd(int m, int n){
      int divisor, dividendo;
      int res=0;
      if(n<m){
        divisor=n;
        dividendo=m;
      }
      else{
        divisor=m;
        dividendo=n;
      }
      do{
        res=dividendo%divisor;
        dividendo=divisor;
        divisor=res;
      }while(!(res==0));
      return dividendo;
    }
}
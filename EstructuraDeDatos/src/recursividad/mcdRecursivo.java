public class mcdRecursivo {
    public static void main(String[] args) {
        int dividendo= mcd(124,6);
        System.out.println(dividendo);
    }
    public static int mcd(int m,int n) 
    {
    if(n<=m && m%n ==0)
    return n;
    else if(m<n)
    return mcd(n,m);
    else
    return mcd(n,m%n);
    }
}

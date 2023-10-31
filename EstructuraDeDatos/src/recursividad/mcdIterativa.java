package recursividad;

import java.util.Scanner;

public class mcdIterativa {
    public static void main(String[] args) {
      mcd(124,6);
    }
    public static int mcd(int m, int n){
        if (n<=m&&m%n==0)
            return n;
        else if (m<n)
            return mcd(n,m);
        else
            return mcd(n,m%n);
    }
}

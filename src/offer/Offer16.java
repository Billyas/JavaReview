package offer;

import org.junit.Test;

public class Offer16 {
    public double myPow(double x, int n) {
        if(n==1) return x;
        if(n==0) return 1;
        if(n==-1) return 1/x;
        double half = myPow(x, n/2);
        double sa = myPow(x,n%2);
        return half*half*sa;
    }
    @Test
    public void test(){
        System.out.println(myPow(10, 2));
    }
}

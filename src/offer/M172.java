package offer;

import org.junit.Test;

import java.math.BigDecimal;

public class M172 {
    public int trailingZeroes(int n) {
        String a = fun(n);
        System.out.println(a);
        int count = 0;
        for(int i=a.length()-1; i>0; i--){
            if(a.charAt(i)=='0') count++;
            else break;
        }
        return count;
    }

    public String fun(int n){
        BigDecimal sum = new BigDecimal(1);
        for(int i=1; i<=n; i++){
            sum = sum.multiply(new BigDecimal(i));
        }
        return sum.toString();
    }
    @Test
    public void test(){
        System.out.println(trailingZeroes(10000));
    }
}

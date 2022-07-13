package day;

public class D6065 {
    public boolean iszero(int [] a) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            a[i]^=res;
        }
        return res>0;
    }

}

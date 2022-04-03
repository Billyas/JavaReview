package offer;

import org.junit.Test;

import java.util.*;

public class m5236 {

    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] res = new long[queries.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = (int) Math.pow(10, intLength-1);
        int end = (int) (Math.pow(10, intLength) -1);
        int c = 0;
        for(int i = start; i<=end; i++){
            if(isP(String.valueOf(i))){
                c++;
                map.put(c, i);
            }
        }

        for(int i=0;i<queries.length; i++){
            res[i] = map.getOrDefault(queries[i],-1);
        }
        return res;
    }
    public  boolean isP(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

    @Test
    public void test(){
        int[] a = {1,2,3,4,5,90};
        kthPalindrome(a,3);
    }
}

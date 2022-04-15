package offer;

import org.junit.Test;

public class M6037 {
    public int largestInteger(int num) {
        StringBuilder a = new StringBuilder(String.valueOf(num));
        int len = a.length();
        int[] b = new int[len];
        for(int i=0; i<len; i++){
            b[i] = a.charAt(i) - '0';
        }
        for(int i = 0; i<len; i++){
            int now = b[i];
            int max = now;
            int e = -1;
            for( int j = i+1; j<len; j++){
                if(b[j]%2 == max%2 && b[j] > max){
                    max = b[j];
                    e = j;
                }
            }
            if(e != -1) {
                b[e] = now;
                b[i] = max;
            }
        }
        int res = 0;
        for(int i=0; i<len; i++){
            res = res*10 + b[i];
        }
        return res;
    }
    @Test
    public void test(){
        System.out.println(largestInteger(1234));
    }
}

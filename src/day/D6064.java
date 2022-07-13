package day;

import org.junit.Test;

import java.util.Arrays;

public class D6064 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int max = 0;
        Arrays.sort(special);
        int a = special[0]-bottom;
        int b = top-special[special.length-1];
        max = Math.max(b, a);
        for (int i = 1; i < special.length; i++) {
            int c = special[i]-special[i-1]-1;
            max = Math.max(max, c);
        }
        return max;
    }
    @Test
    public void test(){
        System.out.println(maxConsecutive(28, 50, new int[]{35,48}));
    }
}

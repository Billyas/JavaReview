package day;

import org.junit.Test;

public class D1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int i = 0; i < accounts.length; i++) {
                int sum = 0;
                for(int j = 0; j < accounts[i].length; j++){
                    sum += accounts[i][j];
                }
                max = Math.max(sum,max);
            }
            return max;
        }

    }
    @Test
    public void test(){
        int[][] t = new int[][]{{1,2,3},{3,2,1}};
        System.out.println((new Solution()).maximumWealth(t));
    }
}

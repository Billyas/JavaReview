package offer;

import org.junit.Test;

public class M300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 0;
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++){
            int max_val = 0;
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    max_val = Math.max(max_val, dp[j]);
                }
            }
            dp[i] = max_val + 1;
            max = Math.max(max,dp[i]);
        }
        return dp[nums.length-1];
    }

    @Test
    public void test(){
        int[] nums = {
            1, 3, 6, 7, 9, 4, 10, 5, 6
        };
        System.out.println(lengthOfLIS(nums));
    }
}

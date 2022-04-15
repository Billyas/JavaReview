package offer2;

import org.junit.Test;

public class O2010 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = 0;
            for (int  j = i ; j>=0; j--){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test(){
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}

package day;

import org.junit.Test;

import java.util.Arrays;

public class D6060 {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if(temp<=min){
                min = temp;
                res = nums[i];
            }
        }
        return res;
    }
    @Test
    public void test(){
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));

    }
}

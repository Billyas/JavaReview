package offer2;

import org.junit.Test;

/*
* 剑指 Offer II 004. 只出现一次的数字
给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
* */
public class O2004 {
    public int singleNumber(int[] nums) {
        int[] counts = new int[32];
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            for(int j = 0; j<32; j++){
                counts[j] += num&1;
                num >>>=1;
            }
        }
        int res = 0;
        int m = 3;
        for(int i = 0; i<32; i++){
            res <<=1;
            res |= counts[31-i]%m;
        }
        return res;
    }
    @Test
    public void test(){
        int[] nums = {1,1,1,3,2,2,2};
        System.out.println(singleNumber(nums));
    }
}

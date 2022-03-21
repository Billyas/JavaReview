package offer;

public class Offer42 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] c = new int[nums.length];
        c[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            c[i] = Math.max(c[i-1]+nums[i],nums[i]);
            if(c[i]>max) max = c[i];
        }

        return max;

    }
}

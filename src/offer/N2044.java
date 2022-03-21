package offer;

import org.junit.Test;

public class N2044 {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, cnt = 0;
        for (int i = 0; i < 1 << nums.length; i++) {
            int orVal = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    orVal |= nums[j];
                }
            }
            if (orVal > maxOr) {
                maxOr = orVal;
                cnt = 1;
            } else if (orVal == maxOr) {
                cnt++;
            }
        }
        return cnt;
    }
    public int getOr(int[] nums){
        if(nums.length==1){
            return nums[0];
        }

        int res=0;
        for(int i:nums){
            res = res|i;
        }
        return res;
    }

    @Test
    public void test(){
//        System.out.println(getOr(new int[]{1, 2, 3}));
        countMaxOrSubsets(new int[]{1,2,3});
        int a= 1<<3;
        int b = 1>>2;
        System.out.println(b);
        System.out.println(a);
    }
}

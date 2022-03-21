package offer;

import org.junit.Test;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int c = 0;
        for(int i:nums){
            if(i%2 == 1){
                res[c++] = i;
            }
        }
        for(int j:nums){
            if(j%2 == 0){
                res[c++] = j;
            }
        }
        return res;
    }

    public int[] exchange2(int [] nums){
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            if(nums[left]%2==0&&nums[right]%2==1){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }else if(nums[left]%2==0&&nums[right]%2==0){
                right--;
            }else if(nums[left]%2==1&&nums[right]%2==1){
                left++;
            }else{
                left++;
                right--;
            }
        }

        return nums;

    }

    @Test
    public void test(){
        exchange2(new int[]{1,2,3,4});
       exchange(new int[]{1,2,3,4});
    }
}

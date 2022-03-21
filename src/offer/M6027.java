package offer;

public class M6027 {
    public int countHillValley(int[] nums) {
        int flag =0;
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                if(flag == 1) {count++;}
                flag = 2;
            }else if(nums[i]<nums[i-1]){
                if(flag == 2){
                    count++;
                }
                flag = 1;
            }

        }
        return count;
    }
}

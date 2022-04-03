package offer;

import org.junit.Test;

import java.util.*;

public class Offer61 {

    public boolean isStraight3(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) continue; // 跳过大小王
            max = Math.max(max, num); // 最大牌
            min = Math.min(min, num); // 最小牌
            if(repeat.contains(num)) return false; // 若有重复，提前返回 false
            repeat.add(num); // 添加此牌至 Set
        }
        return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int wang = 0;
        int q = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                wang++;
            }
            if(i>=1&&nums[i-1]!=0&&nums[i]-nums[i-1]>1){
                q += nums[i]-nums[i-1] -1;
            }
            if(i>=1&&nums[i-1]!=0&&nums[i]==nums[i-1]){
                return false;
            }
        }
        if(q<=wang){
            return true;
        }
        return false;
    }
    @Test
    public void test(){
        int[] a = {0,0,0,11,9};
        isStraight(a);
    }
}

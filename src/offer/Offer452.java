package offer;

import org.junit.Test;

import java.util.Arrays;

public class Offer452 {

        public String minNumber(int[] nums) {
            String[] strs = new String[nums.length];
            for(int i = 0; i < nums.length; i++){
                strs[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(strs, (x,y) -> (x+y).compareTo(y+x));
            StringBuilder ans = new StringBuilder();
            for(String s : strs)
                ans.append(s);
            return ans.toString();
        }
}

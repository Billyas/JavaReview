package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
/*        int[] res = new int[2];
        List<Integer> a = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(Integer i:a){
            if(a.contains(target-i)){
                res[0] = i;
                res[1] = target-i;
                break;
            }
        }
        return res;*/
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if(find<0) return (new int[0]);
            if(a.contains(find)) return (new int[]{nums[i], find});
            a.add(nums[i]);
        }
        return new int[0];
    }
}

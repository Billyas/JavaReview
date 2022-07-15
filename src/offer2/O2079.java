package offer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class O2079 {

        List<Integer> t = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        public List<List<Integer>> subsets(int[] nums) {
            dfs(0, nums);
            return ans;
        }

        public void dfs(int cur, int[] nums) {
            if (cur == nums.length) {
                ans.add(new ArrayList<Integer>(t));
                return;
            }
            t.add(nums[cur]);
            dfs(cur + 1, nums);
            t.remove(t.size() - 1);
            dfs(cur + 1, nums);
        }

        @Test
        public void test() {
            int[] nums = {1, 2, 3};
                System.out.println("for some reasons");
            subsets(nums);

        }

}

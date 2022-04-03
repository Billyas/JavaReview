package offer;

import org.junit.Test;

import java.util.PriorityQueue;

//剑指OFFer滑动窗口的最大值
public class Offer59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0)
            return new int[0];
        int[] res = new int[nums.length - k + 1];
        int start = 0;
        int end = k - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i <= end; i++) {
            pq.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k +1; i++) {

            res[i] = pq.peek();

            end++;
            if(end< nums.length )
                pq.add(nums[end]);
            pq.remove(nums[start]);
            start++;
        }
        return res;
    }
    @Test
    public void test()
    {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(nums,k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

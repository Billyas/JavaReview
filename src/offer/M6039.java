package offer;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 6039. K 次增加后的最大乘积 显示英文描述
 * 通过的用户数2008
 * 尝试过的用户数3085
 * 用户总通过次数2027
 * 用户总提交次数6480
 * 题目难度Medium
 * 给你一个非负整数数组 nums 和一个整数 k 。每次操作，你可以选择 nums 中 任一 元素并将它 增加 1 。
 *
 * 请你返回 至多 k 次操作后，能得到的 nums的 最大乘积 。由于答案可能很大，请你将答案对 109 + 7 取余后返回。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [0,4], k = 5
 * 输出：20
 * 解释：将第一个数增加 5 次。
 * 得到 nums = [5, 4] ，乘积为 5 * 4 = 20 。
 * 可以证明 20 是能得到的最大乘积，所以我们返回 20 。
 * 存在其他增加 nums 的方法，也能得到最大乘积。
 * 示例 2：
 *
 * 输入：nums = [6,3,3,2], k = 2
 * 输出：216
 * 解释：将第二个数增加 1 次，将第四个数增加 1 次。
 * 得到 nums = [6, 4, 3, 3] ，乘积为 6 * 4 * 3 * 3 = 216 。
 * 可以证明 216 是能得到的最大乘积，所以我们返回 216 。
 * 存在其他增加 nums 的方法，也能得到最大乘积。
 *
 *
 * 提示：
 *
 * 1 <= nums.length, k <= 105
 * 0 <= nums[i] <= 106
 * */
public class M6039 {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num);
        }
        for (int i = 0; i < k; i++) {
            int r = heap.poll();
            r += 1;
            heap.offer(r);
        }
        long res = 1;
        for(int i:heap){
            res=(res*i)%1000000007;
        }
        return (int)res;

    }
    @Test
    public void test(){
        int[] nums = {9,8,7};
        int k = 9;
        maximumProduct(nums,k);
    }
}

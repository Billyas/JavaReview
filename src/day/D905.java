package day;

public class D905 {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[left] % 2 == 0) {
                    left++;
                }
                while (left < right && nums[right] % 2 == 1) {
                    right--;
                }
                if (left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
            }
            return nums;
        }
    }

//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/sort-array-by-parity/solution/an-qi-ou-pai-xu-shu-zu-by-leetcode-solut-gpmm/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}

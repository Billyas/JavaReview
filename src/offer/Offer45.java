package offer;
/**
 * @Author: Billyme
 * @Date: 2022/3/13 下午 10:51
 * @Describe:
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer II 045. 二叉树最底层最左边的值
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 * 假设二叉树中至少有一个节点。
 * 示例 1:
 * 输入: root = [2,1,3]
 * 输出: 1
 * 示例 2:
 * 输入: [1,2,3,4,null,5,6,null,null,7]
 * 输出: 7
 * 提示:
 * 二叉树的节点个数的范围是 [1,104]
 * -231 <= Node.val <= 231 - 1
 * 注意：本题与主站 513 题相同： https://leetcode-cn.com/problems/find-bottom-left-tree-value/
 * */
public class Offer45 {
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> res = levelOrder(root);
        List<Integer> a = res.get(res.size()-1);
        return a.get(0);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            //res.add(new ArrayList<Integer>());
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode curr = null;

        while (!queue.isEmpty()) {
            List<Integer> n = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--) { //queue会变化只能采取减法
                curr = queue.poll();
                n.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            res.add(n);
        }
        return res;
    }
}

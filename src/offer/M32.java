package offer;
/**
 * 面试题32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回：
 * [3,9,20,15,7]
 * <p>
 * 提示：
 * 节点总数 <= 1000
 *
 * @Author: Billyme
 * @Date: 2022/3/13 上午 9:05
 * @Describe: 面试题32
 */

/**
 * @Author: Billyme
 * @Date: 2022/3/13 上午 9:05
 * @Describe: 面试题32
 */

import java.util.*;

class TreeNode {
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class M32 {
    //        int[] res = new int[];
    List<Integer> res = new ArrayList<>();

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode curr = null;

        while (!queue.isEmpty()) {
            curr = queue.poll();
            res.add(curr.val);
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回其层次遍历结果：
     *
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     * 提示：
     * 节点总数 <= 1000
     * **/
    public List<List<Integer>> levelOrder2(TreeNode root) {
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
/**
 *请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 *
 * 提示：
 *
 * 节点总数 <= 1000
 * */
    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            //res.add(new ArrayList<Integer>());
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode curr = null;
        while (!queue.isEmpty()) {

            LinkedList<Integer> linkedList = new LinkedList<>();

            for (int i = queue.size(); i > 0; i--) { //queue会变化只能采取减法
                curr = queue.poll();
                if(res.size()%2==0) linkedList.addLast(curr.val);
                else linkedList.addFirst(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            res.add(linkedList);
        }
        return res;
    }

    public static void main(String[] args) {
        M32 m = new M32();
        TreeNode treeNode = new TreeNode(1 , new TreeNode(2,null,null), new TreeNode(3 , null, null));
        m.levelOrder3(treeNode);
    }
}

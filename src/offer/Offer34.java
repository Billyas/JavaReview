package offer;

import org.junit.Test;

import java.util.*;

public class Offer34 {

        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        Deque<Integer> path = new LinkedList<Integer>();

        public List<List<Integer>> pathSum(TreeNode root, int target) {
            dfs(root, target);
            return ret;
        }

        public void dfs(TreeNode root, int target) {
            if (root == null) {
                return;
            }
            path.offerLast(root.val);
            target -= root.val;
            if (root.left == null && root.right == null && target == 0) {
                ret.add(new LinkedList<Integer>(path));
            }
            dfs(root.left, target);
            dfs(root.right, target);
            path.pollLast();
        }
    @Test
    public void test(){
        TreeNode tree = new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        pathSum(tree, 3);
    }
}

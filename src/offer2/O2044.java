package offer2;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class O2044 {

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ret = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int num = Integer.MIN_VALUE;
            int lg = queue.size();
            for (int i = 0; i < lg; i++) {
                TreeNode q = queue.poll();
                num = Math.max(num, q.val);
                if (q.left != null) {
                    queue.add(q.left);
                }
                if (q.right != null) {
                    queue.add(q.right);
                }
            }
            ret.add(num);
        }
        return ret;
    }
}



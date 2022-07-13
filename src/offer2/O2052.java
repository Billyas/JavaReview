package offer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class O2052 {
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode res = new TreeNode(0);
        TreeNode cur = res;
        for(int i = 0; i < list.size(); i++) {
            cur.right = new TreeNode(list.get(i));
            cur = cur.right;
        }
        return res.right;
    }

    public void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
    @Test
    public void test(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        TreeNode res = increasingBST(root);
        while(res != null) {
            System.out.println(res.val);
            res = res.right;
        }
    }
}

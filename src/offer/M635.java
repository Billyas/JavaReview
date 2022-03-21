package offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class M635 {
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);

        int left = 0;
        int right = list.size()-1;

        while(left<right){
            int sum = list.get(left) + list.get(right);
            if(sum == k) return true;
            else if(sum<k) left++;
            else  right--;
        }

        return false;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    @Test
    public void test(){
        TreeNode tree = new TreeNode(1, null,null);
        findTarget(tree,2);
    }
}

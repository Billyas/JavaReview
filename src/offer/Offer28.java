package offer;

import org.junit.Test;

public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode A, TreeNode B){
        if(A==null&&B==null) return true;
        if(A==null||B==null||A.val!=B.val) return false;
        return compare(A.left,B.right)&&compare(A.right,B.left);
    }





    @Test
    public void test(){
        TreeNode a = new TreeNode(1, new TreeNode(2, null, new TreeNode(3,null,null)), new TreeNode(2, null,new TreeNode(3,null,null)));
        isSymmetric(a);
    }
}

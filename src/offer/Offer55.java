package offer;

public class Offer55 {
    int res =0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=0,right=0;
        if(root.left!=null) left = maxDepth(root.left);
        if(root.right!=null) right = maxDepth(root.right);
        int tmp = Math.max(left,right)+1;
        return tmp;
    }
}

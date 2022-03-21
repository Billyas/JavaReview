package offer;

import org.junit.Test;

public class M606 {
//    StringBuffer sb = new StringBuffer("");
    public String tree2str(TreeNode root) {
        String res = "";
        res = predorder(root);

        return res.replaceAll("\\(\\)","");
    }
    public String predorder(TreeNode root){
        if(root == null) return "";
        String tmp = String.valueOf(root.val);
        tmp += "("+ predorder(root.left)+")";
        tmp += "("+ predorder(root.right)+ ")";
        return tmp;
    }
    @Test
    public void test(){
        TreeNode tree = new TreeNode(1, new TreeNode(2, new TreeNode(4, null,null),null),new TreeNode(3,null,null));
        System.out.println(tree2str(tree));
    }
}

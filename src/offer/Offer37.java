package offer;

import org.junit.Test;

public class Offer37 {
    public class Codec {
        private TreeNode root;
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            this.root =root;
            return null;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return root;
        }
    }
    @Test
    public void test(){
        Codec codec = new Codec();
    }

}

package offer;
/*
* 589. N 叉树的前序遍历
给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
* */

import java.util.ArrayList;
import java.util.List;


public class NTreePreorder {

    class Node {
        public int val;
        public List<NTreePreorder.Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<NTreePreorder.Node> _children) {
            val = _val;
            children = _children;
        }
    };

    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return res;
        }
        res.add(root.val);
        for(Node i:root.children){
            preorder(i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

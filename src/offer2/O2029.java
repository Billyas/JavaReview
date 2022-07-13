package offer2;

import org.junit.Test;

/**
 * @Author Billyme
 * @Date  2022/6/18 上午 12:35
 * @Description  剑指 Offer II 029. 排序的循环链表
 * @param   
 * @return  
 **/
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
public class O2029 {
    public Node insert(Node head, int insertVal) {

        if(head == null){
            Node tmp = new Node(insertVal);
            tmp.next = tmp;
            return tmp;
        }

        Node pre = head;
        Node res = new Node();
        Node curr = head.next;
        do{
            //处于最大值与最小值中间
            if(curr.val >=insertVal && pre.val <= insertVal){
                Node tmp = new Node(insertVal, curr);
                pre.next = tmp;
                return head;
            }
            // 出现极值最大与最小
            if(curr.val<pre.val){
                if(insertVal>=pre.val||insertVal<= curr.val){
                    Node tmp = new Node(insertVal, curr);
                    pre.next = tmp;
                    return head;
                }
            }

            pre = curr;
            curr = curr.next;
        }while(pre!=head);

        Node tmp = new Node(insertVal, head.next);
        head.next = tmp;

        return head;
    }

    @Test
    public void O2029test(){
        Node n1 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        n1.next = n3;
        n3.next =n4;
        n4.next = n1;

        Node nn1 = new Node(1);
        nn1.next = nn1;
        insert(n1,0);
    }

}

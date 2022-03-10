package offer;

import java.util.*;

class ListNode {
    public ListNode(){

    }
    public ListNode(int val, ListNode next){
        this.val =val;
        this.next = next;
    }
    public ListNode(int val){
        this.val =val;
    }
    int val;
    ListNode next = null;
}

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class ReverseLinkBM2 {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    // 解法一：双指针(两次遍历)
    //说明：方便理解，以下注释中将用left，right分别代替m,n节点

    public ListNode reverseBetween (ListNode head, int m, int n) {
        //设置虚拟头节点
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        //1.走left-1步到left的前一个节点
        for(int i=0;i<m-1;i++){
            pre = pre.next;
        }

        //2.走roght-left+1步到right节点
        ListNode rigthNode = pre;
        for(int i=0;i<n-m+1;i++){
            rigthNode = rigthNode.next;
        }

        //3.截取出一个子链表
        ListNode leftNode = pre.next;
        ListNode cur = rigthNode.next;

        //4.切断链接
        pre.next=null;
        rigthNode.next=null;

        //5.反转局部链表
        reverseLinkedList(leftNode);

        //6.接回原来的链表
        pre.next = rigthNode;
        leftNode.next = cur;
        return dummyNode.next;
    }
    //反转局部链表
    private void reverseLinkedList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            //Cur_next 指向cur节点的下一个节点
            ListNode Cur_next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = Cur_next ;
        }
    }

    public static void main(String[] args) {
        ReverseLinkBM2 r = new ReverseLinkBM2();
        ListNode t1 = new ListNode(1, new ListNode(2,new ListNode(3,null)));
        r.reverseBetween(t1,1,3);
    }
}

import java.util.*;

class ListNode {
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(int val){
        this.val = val;
        this.next = next;
    }
  int val;
  ListNode next = null;
}
//将一个给定的单链表反转，例：1-2-3-4-5，反转为5-4-3-2-1
public class a {
    /**
     *
     * @param head ListNode类 
     * @return ListNode类
     */

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }


    public static void main(String[] args) {
        ListNode a = new ListNode(0, null);
        a.next = new ListNode(1, null);
        (new a()).reverseList(a);
    }
}
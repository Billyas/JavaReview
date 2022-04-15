package offer;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Offer2026 {
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode t = head;
        while(t!=null){
            deque.add(t);
            t = t.next;
        }
        ListNode res = new ListNode();
        ListNode curr = res;
        while(deque.size()>1){
            ListNode tmp1 =deque.pollFirst();
            tmp1.next = null;
            curr.next = tmp1;
            ListNode tmp = deque.pollLast();
            tmp.next = null;
            curr = curr.next;
            curr.next = tmp;
            curr = curr.next;

        }
        if(!deque.isEmpty()) {
            ListNode tmp = deque.pollLast();
            tmp.next = null;
            curr.next = tmp;
        }
        head = res.next;
    }
    @Test
    public void test(){
        ListNode r = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5,null)))));
        reorderList(r);
    }
}

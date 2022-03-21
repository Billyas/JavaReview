package offer;

import org.junit.Test;

public class offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val == val){
                if(pre==null){
                    curr.val =curr.next.val;
                    curr.next = curr.next.next;
                }else{
                    pre.next = curr.next;
                }
            }
            pre = curr;
            curr = curr.next;
        }
        return head;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int len=0;
        ListNode curr = head;
        ListNode res =null;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        int c = len - k;
        if(len == k){
            return head;
        }
        int  i = 1;
        while(head!=null){
            if(i==c){
                res = head.next;
                break;
            }
            i++;
            head = head.next;
        }
        return res;
    }
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&k>0){
            fast = fast.next;
            k--;
        }

        while(fast!=null){
            fast =fast.next;
            slow = slow.next;
        }
        return slow;
    }

    @Test
    public void test(){
        ListNode a = new ListNode(1, null);
        getKthFromEnd(a,1);
    }
}

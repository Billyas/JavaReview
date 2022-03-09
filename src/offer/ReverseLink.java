package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseLink {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while(current!=null){
            ListNode tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        return  pre;
    }
}
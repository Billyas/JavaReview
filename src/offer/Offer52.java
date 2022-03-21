package offer;

import org.junit.Test;

import java.util.HashSet;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashmap = new HashSet<>();
        ListNode tmp = headA;
        while (tmp != null) {
            hashmap.add(tmp);
            tmp = tmp.next;
        }
        tmp = headB;
        while (tmp != null) {
            if (hashmap.contains(tmp)) {
                return tmp;
            }
            tmp = tmp.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    @Test
    public void test() {
        ListNode headc = new ListNode(3, null);
        ListNode headA = new ListNode(1, headc);
        ListNode headB = new ListNode(2, headc);
        getIntersectionNode(headA, headB);
        getIntersectionNode2(headA,headB);
    }
}

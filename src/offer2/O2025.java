package offer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
* 剑指 Offer II 025. 链表中的两数相加
给定两个 非空链表 l1和 l2 来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
可以假设除了数字 0 之外，这两个数字都不会以零开头。
* */
public class O2025 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1!=null){
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            stack2.add(l2.val);
            l2 = l2.next;
        }
        int n1 = stack1.size();
        int n2 = stack2.size();
        int t = 0;
        List<Integer> res = new ArrayList<>();
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            int a = stack1.pop();
            int b = stack2.pop();
            int sum = a+b+t;
            if(sum>9) t = 1;
            else t = 0;
            res.add(sum%10);
        }
        while(!stack1.isEmpty()){
            int a = stack1.pop();
            int sum = a+t;
            if(sum>9) t =1;
            else t = 0;
            res.add(sum%10);
        }
        while(!stack2.isEmpty()){
            int a = stack2.pop();
            int sum = a+t;
            if(sum>9) t =1;
            else t = 0;
            res.add(sum%10);
        }
        if(t!=0)
            res.add(t);
        Collections.reverse(res);
        ListNode result = new ListNode();
        ListNode curr = result;
        for(int i:res){
            ListNode tmp = new ListNode();
            tmp.val = i;
            tmp.next = null;
            curr.next = tmp;
            curr = tmp;
        }
        return result.next;
    }
    @Test
    public void test(){
//        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3,null)));
//        ListNode l2 = new ListNode(5 ,new ListNode(6,new ListNode(4,null)));
        ListNode l1 = new ListNode(1,null);
        ListNode l2 = new ListNode(9,new ListNode(9,null));
        addTwoNumbers(l1,l2);
    }
}

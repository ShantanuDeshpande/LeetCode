/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        else if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        int val = l1.val + l2.val;
        int carry = val/10;
        ListNode l3 = new ListNode(val%10);
        ListNode temp = l3;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null){
            val = l1.val + l2.val + carry;
            temp.next = new ListNode(val%10);
            carry = val/10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            val = l1.val + carry;
            temp.next = new ListNode(val%10);
            carry = val/10;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null){
            val = l2.val + carry;
            temp.next = new ListNode(val%10);
            carry = val/10;
            temp = temp.next;
            l2 = l2.next;
        }
        if (carry != 0){
            temp.next = new ListNode(carry);
        }
        return l3;
    }
}

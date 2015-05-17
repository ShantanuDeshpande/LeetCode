/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t1 = head;
        ListNode t2 = head;
        for(int i = 0; i < n; ++i){
            t1 = t1.next;
        }
        if (t1 == null){
            head = head.next;
            return head;
        }
        while(t1.next != null){
            t1 = t1.next;
            t2 = t2.next;
        }
        t2.next = t2.next.next;
        return head;
    }
}

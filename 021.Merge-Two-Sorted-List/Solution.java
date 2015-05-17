/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l4 = new ListNode(0);
        ListNode l3 = l4;
        if (l1 == null && l2 == null){
            return null;
        }
        else if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            }
            else{
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        
        while(l1 != null){
            l3.next = l1;
            l1 = l1.next;
            l3 = l3.next;
        }
        
        while(l2 != null){
            l3.next = l2;
            l2 = l2.next;
            l3 = l3.next;
        }
        
        return l4.next;
    }
}

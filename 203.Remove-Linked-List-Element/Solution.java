/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode node = head;
        while(node != null && node.next != null){
            ListNode temp = node.next;
            while(temp != null && temp.val == val){
                node.next = temp.next;
                temp = node.next;
            }
            node = node.next;
        }
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
    		return null;
    	}
    	if (head.next == null){
    		return head;
    	}
    	ListNode temp = head;
    	while(temp.next != null){
    		temp = temp.next;
    	}
    	while(temp != head){
    		ListNode curr = head.next;
    		head.next = temp.next;
    		temp.next = head;
    		head = curr;
    	}
        return temp;
    }
}

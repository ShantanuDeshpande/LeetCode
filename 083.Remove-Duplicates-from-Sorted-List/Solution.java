/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
			return null;
		}
		if (head.next == null){
			return head;
		}
        ListNode n = head;
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(n.val);
        while(n.next != null){
        	if(hs.contains(n.next.val)){
        		ListNode temp = n.next.next;
        		while(temp != null && hs.contains(temp.val)){
        			temp = temp.next;
        		}
        		if(temp == null){
        			n.next = null;
        			break;
        		}
        		else{
        			n.next = temp;
        			hs.add(temp.val);
        		}
        	}
        	else{
        		hs.add(n.next.val);
        	}
        	n = n.next;
        }
        return head;
    }
}

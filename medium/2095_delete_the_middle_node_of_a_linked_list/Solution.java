/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // single or empty list
        if (head == null || head.next == null) return null;
        
        ListNode ans = head;
        ListNode prev = findMiddle(head);
        
        // last node case
        if (prev.next.next == null) {
            prev.next = null;
        } else {
            prev.next = prev.next.next;
        }
        
        return ans; 
    }
    
    public ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head; 
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel; 

        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next; 
        }
        return prev;
    }
}

// cases single node
// delete itself, return null

// cases no nodes; 
// return head
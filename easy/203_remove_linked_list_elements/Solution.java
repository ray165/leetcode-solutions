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
    public ListNode removeElements(ListNode head, int val) {
        
        if (head == null) {
            return head; 
        }
        
        // Make the curr head point to nothing, and make the new head the next node
        while (head != null && head.val == val) {
            head = head.next; 
        }
        
        if (head == null) return null;
        
        ListNode curr = head; 
        ListNode returnHead = head; 
        
        while (curr != null) {
            if (curr.next != null && curr.next.next != null && curr.next.val == val) {
                curr.next = curr.next.next; 
            } else if (curr.next != null && curr.next.next == null && curr.next.val == val) {
                // last node
                curr.next = null; 
            } 

            curr = curr.next; 
        }
        
        return returnHead;
    }
}

// cases:

// middle nodes

// head

// tail 


            // Make the node skip over it
//             if (curr.val == val && curr.next != null) {
//                 prev.next = curr.next;
//             }
            
//             // for the last node
//             if (curr.val == val && curr.next == null) {
//                 prev.next = null; 
//             } else {
//                 prev = curr;
//                 curr = curr.next; 
//             }
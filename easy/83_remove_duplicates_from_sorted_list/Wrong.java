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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        
        ListNode ans = head;
        
        while (head != null) {
            set.add(head.val);
            if (head.next != null && set.contains(head.next.val)) {
                if (head.next.next == null) {
                    head.next = null;
                } else {
                    head.next = head.next.next;
                }
            } else if (head.next == null &&  set.contains(head.val)) {
                head = null;
                break;
            }
            
            head = head.next; 
        }
        
        return ans; 
    }
}
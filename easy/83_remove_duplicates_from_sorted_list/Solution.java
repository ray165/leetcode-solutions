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
        
        ListNode sentinnel = new ListNode(-1);
        sentinnel.next = head;
        ListNode prev = sentinnel;
        
        while (head != null) {

            if (set.contains(head.val)) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            
            set.add(head.val);
            head = head.next;
        }
        
        return sentinnel.next; 
    }
}

// Sept 19, 2022
// Use a stack to collect all the list nodes... top of the stack == last entries 
// Used a fast and slow pointer to detect mid point of palindrome
// If Top of Stack != curr node, it's not a palindrome
// NOTE: Poor performance because this is two pass
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode slow = head;
        ListNode fast = head; 
        ListNode builder = head;

        // Create a stack: end nodes are at top
        while (builder != null) {
            s.push(builder.val);
            builder = builder.next;
        }
        
        // Palindrone detection only need to go till half way point... still works if you traverse without knowing
        // the middle node
        while (fast != null && fast.next != null) {
            if (s.peek() != slow.val) {
                return false;
            } else {
                s.pop();
            }
            
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
    }
}
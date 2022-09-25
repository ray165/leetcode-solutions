
// Sept 24, 2022
// Use of stack of queues to keep track of alphanumeric elements
// pass through both to see if they're a palindrome.
class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                st.push(c);
                q.add(c);
            }
        }
        
        while (!st.isEmpty()) {
            if (st.peek() != q.peek()) {
                return false; 
            }
            st.pop();
            q.remove();
        }
        
        Character.i
        return true;
    }
}
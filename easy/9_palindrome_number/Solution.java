class Solution {
    public boolean isPalindrome(int x) {        
        if (x < 0) return false; 
        if ( x >= 0 && x < 10) return true;
        
        int helper = x; 
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        
        while (helper > 0) {
            int lastDigit = helper % 10;
            q.add(lastDigit);
            s.add(lastDigit);
            helper = helper / 10;
        } 
        
        while (!s.isEmpty()) {
            int last = q.remove();
            int first = s.pop();
            if (last != first) return false;
        }
        
        return true;
    }
}
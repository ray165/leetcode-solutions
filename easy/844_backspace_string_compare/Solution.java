class Solution {
    public boolean backspaceCompare(String s, String t) {
        char POUND = '#';
        Deque<Character> s1 = new ArrayDeque<>();
        Deque<Character> s2 = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!s1.isEmpty() && s.charAt(i) == POUND) {
                s1.pop();
            } 
            
            if (s.charAt(i) != POUND) {
                s1.push(s.charAt(i));
            }
        }
        
        for (int j = 0; j < t.length(); j++) {
            if (!s2.isEmpty() && t.charAt(j) == POUND) {
                s2.pop();
            } 
            
            if (t.charAt(j) != POUND) {
                s2.push(t.charAt(j));
            }
        }
        
        if (s1.size() != s2.size()) return false;
        
        while (!s1.isEmpty()) {
            if (s1.pop() != s2.pop()) return false;
        }
        
        return true;
    }
}
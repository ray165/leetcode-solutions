class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == '*') {
                stack.pop();
            }
            
            if (s.charAt(i) != '*') stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (Character x : stack) {
            sb.append(x);
        }
        
        return sb.reverse().toString();
    }
}
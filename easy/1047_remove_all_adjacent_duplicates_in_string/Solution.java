// Sept 18, 2022
// Uses a stack to collect all the non duplicate characters
// pop when there's an adjacent duplicate string

// Challenge here is to rebuild the string, perhaps theres a better way to construct // the results answer

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        
        String ans = "";
        
        while (!stack.isEmpty()) {
            ans = stack.pop() + "" + ans;
        }
        return ans;
    }
}
// Sept 18, 2022

// Use of stack here to keep track of OPENING braces
// if we find a closing brace, we pop it off the stack

// Depth increases for every open brace we see
// To take into account non-nested braces, remove from the depth counter if we
// come across a CLOSING BRACE

// When we are using a stack, there must be some sort of usecase where we want to
// 1. POP and PUSH items
// 2. Keep track of the last item LIFO (stack)
class Solution {
    
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int depth = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                depth++;
            }
            
            if (s.charAt(i) == ')' && stack.peek() == '(') {
                depth--;
                stack.pop();
            }
            
            if (depth > max) {
                max = depth;
            }
        }
        
        return max;
    }
}
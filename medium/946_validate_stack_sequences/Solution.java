// Oct, 6 2022
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> s = new ArrayDeque<>();
        
        int popCount = 0;
        for (int i = 0; i < pushed.length; i++) {
            s.push(pushed[i]);
            while (!s.isEmpty() && popCount < pushed.length && s.peek() == popped[popCount]) {
                s.pop();
                popCount++;
            }
        }
        
        return popCount == pushed.length;
    }
}

// X can not be popped before Y 

// 
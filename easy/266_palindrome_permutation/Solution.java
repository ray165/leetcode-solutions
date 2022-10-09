class Solution {
    public boolean canPermutePalindrome(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int forgive = 1; 
        char[] chars = s.toCharArray();
        
        Arrays.sort(chars);
        
        for (char x : chars) {
            if (!stack.isEmpty() && x == stack.peek()) {
                stack.pop();
            } else if (!stack.isEmpty() && x != stack.peek()) {
                // Occurence where prev is not the same as curr
                forgive--;
                stack.pop();
                stack.push(x);
            } else {
                stack.push(x);
            }
        }
        
        if (s.length() % 2 == 0 && forgive < 1) return false;
        
        return forgive >= 0;
    }
}

// if the strength length is even, then there must be an equal number of characters
// That can be spread on both sides on the string left and right 


// if one character count is greater than 50% of the string length, it cant be a palindrome

// odd strings --> at most one character count as an odd count

// Solution:
// Parse 1 to make a frequency table of the character counts 

// Parse 2 to subtract from the 
// Sept 26, 2022

// I guess i misunderstood this question. 
// So when s[left] != s[right] --> it can be transformed to ANY character
// That said, we don't need to do the actual transformation itself.
// Because we have these operations available we can make left == right or vice versa
// ^^ intrinsincally. So we can skip the transformation and count the number of misses

class Solution {
    public boolean makePalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int transforms = 0; 
        boolean found = false;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (transforms >= 2) return false;
                
                StringBuilder leftString = new StringBuilder(s);
                leftString.setCharAt(left, s.charAt(right));
                
                StringBuilder rightString = new StringBuilder(s);
                rightString.setCharAt(right, s.charAt(left));
                
                found = isPalindrome(leftString.toString(), left, right) || isPalindrome(rightString.toString(), left, right);
                if (found) return true;
                
                transforms++;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true; 
    }
} 
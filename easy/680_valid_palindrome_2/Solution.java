// Sept 25, 2022
// technically nested While loop but it's still O(N) because the second check finishes it off
class Solution {
    public boolean validPalindrome(String s) {        
        int left = 0;
        int right = s.length() - 1; 
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return miniCheck(s, left + 1, right) || miniCheck(s, left, right - 1);
            }
            
            left++;
            right--;
        }
        return true;
    }
    
    public boolean miniCheck(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }
}
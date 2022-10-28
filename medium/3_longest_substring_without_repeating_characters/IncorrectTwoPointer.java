class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = s.length - 1;
        int max = 0;
        
        while (left <= right) {
            if (!isValid(s)) {
                if (isValid(s.substring(left + 1, right))) {
                    max = Math.max(max, right - (left + 1));
                }
                
                if (isValid(s.substring(left, right - 1))) {
                    max = Math.max(max, (right - 1) - left);
                }
            }
            
        }
        
        return max;
    }
    
    public boolean isValid(string s) {
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length; i++) {
            if (set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }
}

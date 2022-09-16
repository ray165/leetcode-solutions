// Sept 15, 2022
class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
        int counter = 0;
        
        for (int i = 0, j = i + 1, k = j + 1; k < s.length(); i++, j++, k++) {
            if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(i) != s.charAt(k)) {
                counter++;
            }
        }
        return counter;
    }
}
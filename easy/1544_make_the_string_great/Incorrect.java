class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0; 
        int right = 1;
        while (right < sb.length()) {
            if (isSame(sb.charAt(left), sb.charAt(right))) {
                sb.delete(left, right);
            } else {
                left++;
                right++;
            }
        }
        
        return sb.toString();
    }

    public boolean isSame(char a, char b) {
        char bigger = a > b ? a : b;
        char smaller = a < b ? a : b;

        smaller += 32;

        return smaller == bigger;
    }
}
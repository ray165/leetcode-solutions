class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> set = new HashSet<>();
        int last = 0;
        int forward = 0;

        while (forward < s.length()) {
            char c = s.charAt(forward);

            if (set.contains(c)) {
                while (s.charAt(last) != c && last < forward) {
                    set.remove(s.charAt(last));
                    last++;
                }
            }

            if (s.charAt(last) == c && last != forward) {
                set.remove(s.charAt(last));
                last++;
            }

            set.add(c);

            longest = Math.max(set.size(), longest);

            forward++;
        }

        return longest;
    }
}

/**
    Release up the the curr if its a repeated character

----------v
    [ w p w k e w ]
--------^  
// tracking first non duplicate, increment it if we encounter a duplicate


----------v
    [ w p p k e w ]
------^  

 */


   
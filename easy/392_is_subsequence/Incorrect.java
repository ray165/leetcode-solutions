class Solution {
    public boolean isSubsequence(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < t.length() ; i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            set.add(c);
        }
        
        for (Character x : set) {
            if (!tMap.containsKey(x) || sMap.get(x) > tMap.get(x)) return false;
        }
        
        return true;
    }
}
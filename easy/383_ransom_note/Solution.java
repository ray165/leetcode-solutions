// Sept 11, 2022
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> magMap = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magMap.put(c, magMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            
            if (!magMap.containsKey(c)) {
                return false;
            }
            
            if (map.get(c) > magMap.get(c)) {
                return false;
            }
        }
        
        return true;
    }
}
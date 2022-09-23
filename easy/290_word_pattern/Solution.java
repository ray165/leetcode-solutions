class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Determine pattern character corresonds to one word only 
        Map<Character, String> map = new HashMap<>();
        String[] tokens = s.split(" ");
        Set<String> hasBeenSeen = new HashSet<>();
        
        if (pattern.length() != tokens.length) return false;
        
        // Map unique words to unique pattern letters
        for (int i = 0; i < tokens.length; i++) {
            if (!map.containsKey(pattern.charAt(i))  && !hasBeenSeen.contains(tokens[i]) ) {
                map.put(pattern.charAt(i), tokens[i]);
                hasBeenSeen.add(tokens[i]);
            }
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!tokens[i].equals(map.get(c))) return false;
        }
        
        return true; 
        
    }
}
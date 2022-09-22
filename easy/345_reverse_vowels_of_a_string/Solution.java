class Solution {
    
    Map<Character, Character> map;
    
    public Solution() {
        map = new HashMap<>();
        map.put('a', 'A');
        map.put('A', 'A');
        map.put('e', 'E');
        map.put('E', 'E');
        map.put('i', 'I');
        map.put('I', 'I');
        map.put('o', 'O');
        map.put('O', 'O');
        map.put('u', 'U');
        map.put('U', 'U');
    }
    
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        
        int left = 0; 
        int right = chars.length - 1;
        
        while (left < right) {
            
            // Move to vowel
            while (left < right && (!map.containsKey(chars[left])  )) {
                left++;
            }
            
            while (left < right && (!map.containsKey(chars[right]) )) {
                right--;
            }
            
            // Swap two vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }

            
            left++;
            right--;
        }
        
        return new String(chars);
    }
}
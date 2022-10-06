class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!set.contains(curr)) sb.append(curr);
        }
        return sb.toString();
    }
}
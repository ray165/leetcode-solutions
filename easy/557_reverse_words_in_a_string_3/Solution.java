// This is very inefficient, we can do a one pass O(n2) reversal
// stop at index where we see a ' ' SPACE
// reverse from curr up to that
class Solution {
    public String reverseWords(String s) {
        // tokenize each word
        List<String> tokens = Arrays.asList(s.split(" "));
        
        // turn each token into a char array
        ArrayList<char[]> letters = new ArrayList<>();
        for (String token : tokens) {
            System.out.println(token);
            letters.add(token.toCharArray());
        }
        
        // apply reversal on each char array
        for (char[] brokenTokens : letters) {
            int left = 0;
            int right = brokenTokens.length - 1;
            while (left < right) {
                char temp = brokenTokens[left]; 
                brokenTokens[left] = brokenTokens[right];
                brokenTokens[right] = temp;
                
                left++;
                right--;
            }
            System.out.println(Arrays.toString(brokenTokens));
        }
        
        // char array --> token --> add back together with spaces
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.size(); i++) {
            sb.append(letters.get(i));
            if (i != letters.size() - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
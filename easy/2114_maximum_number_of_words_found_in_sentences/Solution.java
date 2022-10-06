class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for (int i = 0; i < sentences.length; i++) {
            String[] tokens = sentences[i].split(" ");
            if (tokens.length > max) {
                max = tokens.length;
            }
        }
        
        return max;
    }
}
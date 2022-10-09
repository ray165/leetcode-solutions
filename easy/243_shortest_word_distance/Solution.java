class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        // stack to find the first word either word1 or word2
        Deque<String> s = new ArrayDeque<>();
        int count = Integer.MAX_VALUE;
        int foundIndex = -1; 
        
        for (int i = 0; i < wordsDict.length; i++) {
            String curr = wordsDict[i];
            boolean found = curr.equals(word1) || curr.equals(word2);
            if (foundIndex < 0 && found) {
                foundIndex = i;
            }
            
            // Next occurence
            if (found && !curr.equals(wordsDict[foundIndex])) {
                count = Math.min(count, i - foundIndex);
                foundIndex = i;
            } else if (found && curr.equals(wordsDict[foundIndex])) {
                // if we see the same letter before seeings the opposite, just update the index.
                foundIndex = i;
            }
            
        }
        
        
        return count;
        
    }
}

// word1 or word2 can be seen first. 

// keep track of which word is found first -- save this 
// then start counting 


// both words are gauranteed to appear 


// find where x.equals(word1) || x.equals(word2) and assign that word into 'found'

// when we find the next combination where its word1 || word2 BUT not the same as found

// Then we save the distance as [i] [found[i]]
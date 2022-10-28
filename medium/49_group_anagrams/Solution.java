class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>(); 
        Set<String> set = new HashSet<>();
        String[] helper = new String[strs.length];
        
        int index = 0;
        for (String x : strs) {
            char[] chars = x.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            set.add(sorted);
            helper[index] = sorted;
            index++;
        }
        
        // 
        for (String x : set) {
            List<String> subList = new ArrayList<>();
            for (int i = 0; i < helper.length; i++) {
                if (x.equals(helper[i])) subList.add(strs[i]);
            }
            ans.add(subList);
        }
    
        return ans;
    }
}

// validate if something is an anagram .
// sort each token


// parse each token into a set to find uniqueness


// for each token in the set, look at the list of tokens and then package htem into one array list



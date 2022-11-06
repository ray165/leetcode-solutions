class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> tokens = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0 ; i < list1.length; i++) {
            tokens.put(list1[i], i);
        }

        for (int i = 0 ; i < list2.length; i++) {
            int currSum;
            if (tokens.containsKey(list2[i])) {
                currSum = tokens.get(list2[i]) + i;
                if (currSum < minIndexSum) {
                    ans.clear();
                    ans.add(list2[i]);
                    minIndexSum = currSum;
                } else if (currSum == minIndexSum) {
                    ans.add(list2[i]);
                }
            }

        }
        String[] stringsArr = new String[ans.size()];
        stringsArr = ans.toArray(stringsArr);

        return stringsArr;
    }
}
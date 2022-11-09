class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        Map<Integer, Integer> prevCount = new HashMap<>();

        for (int x : nums) {
            if (prevCount.containsKey(x)) {
                pairs += prevCount.get(x);
            }
            prevCount.put(x, prevCount.getOrDefault(x, 0) + 1);
        }

        return pairs;
    }
}

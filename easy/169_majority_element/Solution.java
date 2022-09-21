class Solution {
    public int majorityElement(int[] nums) {
        // use of map to collect a frequency table
        Map<Integer, Integer> map = new HashMap<>();
        
        for (Integer x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > (nums.length / 2)) {
                return x;
            }
        }
        
        return 0;
    }
}
// Sept 16, 2022

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        
        List<Integer> missing = new ArrayList<>();
        
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing.add(i);
            }
        }
        
        return missing;
    }
}
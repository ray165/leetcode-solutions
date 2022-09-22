class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        // use memoization
        // key is the nums[i] ,  the value == index
        // strictly increasing ==> has no duplicates
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 1; i < nums.length - 1; i++) {
            boolean leftSide = false;
            boolean rightSide = false;
            
            if (map.containsKey(nums[i] - diff)) leftSide = true;
            if (leftSide && map.containsKey(nums[i] + diff)) rightSide = true;
            
            if (leftSide && rightSide) counter++;
        }
        
        return counter;
    }
}
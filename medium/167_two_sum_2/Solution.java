// Jan 25, 2023

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int desired = target - numbers[i];
            if (map.containsKey(desired) && map.get(desired) > i) {
                ans[0] = i + 1;
                ans[1] = map.get(desired) + 1;
            }
        }

        return ans;

    }
}
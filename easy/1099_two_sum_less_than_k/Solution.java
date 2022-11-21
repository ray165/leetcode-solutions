class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int curr = nums[i] + nums[j];
                if (curr > max && curr < k) max = curr;
            }
        }

        return max;
    }
}
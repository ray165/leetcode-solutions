// use the quation sum - leftsum - nums[i] to find the middle index (remove the middle index from the sum) 
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for (int x : nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}

// loop through using two points, one start one end .
// find the sum as we go along. when left == right, we exit
// this solution is NOT optimal, it just gets the top 3 greatest. 
class Solution {
    public int largestPerimeter(int[] nums) {
        // Ascending
        Arrays.sort(nums);        
        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }
}

// abc

// if a & c < b then its impossible to close the trisangle

// sort the array
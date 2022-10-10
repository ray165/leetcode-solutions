// first attempt, time limit exceeded

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int runningProduct = 1;
        int[] output = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            
            if (i == 0) {
                output[i] = productRightSide(nums, i + 1);
            } else if (i == nums.length - 1) {
                output[i] = runningProduct;
            } else {
                output[i] = runningProduct * productRightSide(nums, i + 1);
            }
            runningProduct *= nums[i];
        }
        return output;
    }
    
    public int productRightSide(int[] nums, int start) {
        int product = 1;
        while (start < nums.length) {
            product *= nums[start];
            start++;
        }
        return product;
    }
}


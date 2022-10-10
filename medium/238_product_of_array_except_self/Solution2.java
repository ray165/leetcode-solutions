class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] output = new int[nums.length];
        
        int leftPrefixSum = 1;
        int rightPrefixSum = 1;
        
        for (int i = 0; i < nums.length; i++) {
            leftArr[i] = leftPrefixSum;
            leftPrefixSum *= nums[i];
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            rightArr[i] = rightPrefixSum;
            rightPrefixSum *= nums[i];
        }
        
        for (int i = 0; i < output.length; i++) {
            output[i] = leftArr[i] * rightArr[i];
        }
        
        return output; 
    }
}
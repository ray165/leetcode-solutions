class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        
        // from [0] < search in between > [n -1]
        for (int j = 1; j < nums.length - 1; j++ ) {
            boolean leftSide = false;
            boolean rightSide = false; 

            leftSide = binarySearch(nums, 0, j - 1, nums[j] - diff);
            if (leftSide) {
                rightSide = binarySearch(nums, j + 1, nums.length - 1, nums[j] + diff);
            }
            
            if (leftSide && rightSide) {
                counter++;
            }
        }
        
        return counter;
    }
    
    public boolean binarySearch(int nums[], int start, int end, int search) {
        int left = start;
        int right = end;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == search) {
                return true;
            }
            
            if (nums[mid] > search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
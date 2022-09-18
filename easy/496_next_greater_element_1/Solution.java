// Sept 17, 2022

// For this solution, i use a Stack to track the current item (locked on)
// and compare it to subsequence numbers in nums2 array to see if they're greater
// For the first greatest number, we add it to the results array
// The empty() state of the stack is used to signify if anything is found.
// If it's not empty, we place -1 in the result[i] array

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[nums1.length];
        
        for (int i  = 0 ; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    stack.push(nums2[j]);
                }
                
                if (!stack.empty() && nums2[j] > stack.peek()) {
                    result[i] = nums2[j];
                    stack.pop();
                }
            }
            
            if (!stack.empty()) {
                result[i] = -1;
                stack.pop();
            }
            System.out.println("result array: " + result[i]);
        }
        
        return result;
    }
}
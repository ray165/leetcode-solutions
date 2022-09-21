// Use of stacks
// terrible performance

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Stack<Integer> evens = new Stack<>();
        Stack<Integer> odds = new Stack<>();

        for (Integer x : nums) {
            if (x % 2 == 0) {
                evens.push(x);
            } else {
                odds.push(x);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!evens.isEmpty()) {
                nums[i] = evens.pop();
            } else {
                nums[i] = odds.pop();
            }
        }
        
        return nums;
    }
}
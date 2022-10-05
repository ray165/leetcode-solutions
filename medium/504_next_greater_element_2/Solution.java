class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> s = new ArrayDeque<>();
        // int[] ans = new int[nums.length];
        int[] ans = new int[nums.length * 2];

        Arrays.fill(ans, -1);
        
        int[] circularNums = new int[nums.length * 2];
        int left = 0;
        int numsPointer = 0;
        while (left < circularNums.length) {
            circularNums[left] = nums[numsPointer];
            
            left++;
            if (numsPointer == nums.length - 1) {
                numsPointer = 0;
            } else {
                numsPointer++;
            }
        }
        
//         for (int i = 0; i < nums.length; i++) {
//             // special case where if i = nums.length - 1 --> then it compares to the next element nums[0]
            
//             // decreasing mono stack
//             while (!s.isEmpty() &&  nums[i] > nums[s.peek()]) {
//                 // pop it from the stack
//                 int firstGreatestIndex = s.pop();
                
//                 // then assign the top of the stack element to have the curr value (nums[i]) as the greatest number
//                 ans[firstGreatestIndex] = nums[i];
//             }
            
//             s.push(i);
//         }
        
        for (int i = 0; i < circularNums.length; i++) {
            // special case where if i = nums.length - 1 --> then it compares to the next element nums[0]
            
            // decreasing mono stack
            while (!s.isEmpty() &&  circularNums[i] > circularNums[s.peek()]) {
                // pop it from the stack
                int firstGreatestIndex = s.pop();
                
                // then assign the top of the stack element to have the curr value (nums[i]) as the greatest number
                ans[firstGreatestIndex] = circularNums[i];
            }
            
            s.push(i);
        }
        
        // build the ans
        int[] realAns = new int[nums.length];
        for (int i = 0; i < realAns.length; i++) {
            realAns[i] = ans[i];
        }

        return realAns;
    }
}

// we wannt find the NEXT GREATER ELEMENT
// so we use a decreasing stack to record the smallest elements. If we find an elements bigger than s.peek() then it is
// signficant

// for the last element, we could run another for loop jsut for it
// trace through the entire array, make another mono decreasing stack. 
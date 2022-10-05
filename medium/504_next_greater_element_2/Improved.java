// Oct 4, 2022
// Trick here is to use circular indexing of i % nums.length
// And use a mono dreceasing stack where nums[i] > nums[s.peek()]
// keep track of the INDEX in the stack because that's what we care about... we want to access the number that's greater

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[nums.length];

        Arrays.fill(ans, -1);
        
        for (int i = 0; i < nums.length * 2; i++) {        
            int circularIndex = i % nums.length;
            System.out.println(circularIndex);
            
            // decreasing mono stack
            while (!s.isEmpty() &&  nums[circularIndex] > nums[s.peek()]) {
                // pop it from the stack
                int firstGreatestIndex = s.pop();
                
                // then assign the top of the stack element to have the curr value (nums[i]) as the greatest number
                ans[firstGreatestIndex] = nums[circularIndex];
            }
            
            s.push(circularIndex);  // make sure we use the circular index here otherwise we'd push out of bounds index to the stack
        }

        return ans;
    }
}

// we wannt find the NEXT GREATER ELEMENT
// so we use a decreasing stack to record the smallest elements. If we find an elements bigger than s.peek() then it is
// signficant

// for the last element, we could run another for loop jsut for it
// trace through the entire array, make another mono decreasing stack. 
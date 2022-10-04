// Used a monotonic stack to keep track of the minimum

// Went in reverse, wondering if it's faster if i went the other way
// Poor performance cause I used two data structures 
// and had to reverse the arraylist then convert to primitive integer array.

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        List<Integer> discountedArray = new ArrayList<>();
        // add everything to a stack
        // reverse the answer and convert it to an array
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && prices[i] < s.peek()) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                discountedArray.add(prices[i]);
            } else {
                discountedArray.add(prices[i] - s.peek());
            }
            
            s.push(prices[i]);
        }
        
        // reverse the array list to get the proper order
        Collections.reverse(discountedArray);
        
        return discountedArray.stream().mapToInt(i -> i).toArray();
    }
}
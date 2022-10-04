class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // mono decreasing stack
        Deque<Integer> s = new ArrayDeque<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < temperatures.length ; i++) {
            int counter = 0;
            while (!s.isEmpty() &&  temperatures[i] > temperatures[s.peek()] ) {
                int prevDay = s.pop();
		// controls how multiple days can also have the same FIRST warm day
                ans[prevDay] = i - prevDay;  
            }
            
            s.push(i);
        }
        
        return ans;        
    }
}
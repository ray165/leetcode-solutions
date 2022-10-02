// oct 1, 2022
class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = -1;
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > max) {
                max = heights[i];
                s.add(i);
            }
        }
        
        int[] arr = new int[s.size()];
        int j = 0;
        while (!s.isEmpty()) {
            arr[j] = s.pop();
            j++;
        }
        
        return arr;
    }
}
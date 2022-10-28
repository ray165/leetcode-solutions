class Solution {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        
        if (n == 0 || n == 1) return map.get(n);
        
        for (int i = 2; i <= n; i++) {
            int curr = map.get(i - 1) + map.get(i -2);
            map.put(i, curr);
        }
        
        return map.get(n);
    }
}
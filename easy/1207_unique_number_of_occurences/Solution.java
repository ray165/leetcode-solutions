// Sept 25, 2022
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>(); 
        
        for (Integer x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (Integer x : map.values()) {
            // System.out.println(x);
            if (s.contains(x)) {
                return false;
            }
            s.add(x);
        }
        
        return true;
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list;
            if (map.containsKey(nums[i])) {
                list = map.get(nums[i]);

                for (int j = 0; j < list.size(); j++) {
                    if (Math.abs(list.get(j) - i) <= k) return true;
                }

                list.add(i);
                map.put(nums[i], list);
            } else {
                list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        return false;
    }
}
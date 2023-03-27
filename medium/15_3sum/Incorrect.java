class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // three numbs that add to zero 
        
        // 2 pointers e.g. 1st and 2nd
        // 3rd number must be (a + b + c) == 0
        // c == 0 - (a + b)
        // look ahead and see if theres any numbers that are equal to that
        
        // We can presort the numbers so that if we hit a number greater than 'c' we dont have to access it 
        
        // Find distinct triplet: sort the list then add it to a Set

        // value           v----- index in nums array
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<List<Integer>> unique = new HashSet<>(); 
        List<List<Integer>> triples = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> al = new ArrayList<>();
                al.add(i);
                map.put(nums[i], al);
            } else {
                List<Integer> indexes = map.get(nums[i]);
                indexes.add(i);
                map.put(nums[i], indexes);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int desired = desiredNumber(nums[i], nums[j]);

                if (map.containsKey(desired)) {
                    int firstGreatest = findFirstGreatestIndex(map.get(desired), j);
                    if (firstGreatest > 0) {
                        // build a triplet;
                        List<Integer> triple = new ArrayList<>();
                        triple.add(nums[i]);
                        triple.add(nums[j]);
                        triple.add(desired);
                        Collections.sort(triple);

                        triples.add(triple);
                    }
                }
            }
        }


        // prune the list of triples
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < triples.size(); i++) {
            List<Integer> triple = triples.get(i);
            if (!unique.contains(triple)) {
                ans.add(triple);
            }
        }

        return ans;

    }

    public int findFirstGreatestIndex(List<Integer> indexes, int a) {
        for (int i = 0; i < indexes.size(); i++) {
            if (indexes.get(i) > a) return i;
        }
        return -1;
    }

    public int desiredNumber(int a, int b) {
        return  0 - (a + b);
    }

    public Boolean isSumEqualZero(int a, int b, int c) {
        return a + b + c == 0;
    }
}
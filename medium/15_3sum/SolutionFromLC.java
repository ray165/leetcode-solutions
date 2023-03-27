class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // if (nums[i] > 0) break;
            // if (i > 0 && nums[i] == nums[i - 1]) continue; // prevents duplciatse without hatset

            // get two isSumEqualZero


            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(i, nums, ans);
            }
        }
        return ans;
    }

    public void twoSum(int i, int[] nums, List<List<Integer>> ans ) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                // List<Integer> triple = new ArrayList<>();
                // triple.add(nums[i]);
                // triple.add(nums[left]);
                // triple.add(nums[right]);
                // ans.add(triple);

                // for this test case, where sum == 0, forgot to increment decrement pointer. Perhaps i could just break
                ans.add(Arrays.asList(nums[i], nums[left++], nums[right--]));

                // skip duplicates as we'd find the same thing
                while (left < right && nums[left] == nums[left - 1]) left++;
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
}
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        if 0 not in nums:
            return 0
        big = max(nums)
        # gauss formula
        expected = (0 + big)*(big - 0 + 1)/ 2
        total = int(expected - sum(nums))
        return big + 1 if total == 0 else total
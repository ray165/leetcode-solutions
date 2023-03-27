class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        map = {}
        for num in nums:
            if num in map:
                map[num] = map[num] + 1
            else:
                map[num] = 1
        
        for (key, value) in map.items():
            if value == 1:
                return key

        return -1
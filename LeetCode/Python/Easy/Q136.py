class Solution:
    def singleNumber(self, nums) -> int:
        ans = 0
        for num in nums:
            ans ^= num
        return ans
class Solution:
    def missingNumber(self, nums) -> int:
        n = len(nums)
        totalSum = n * (n + 1) // 2
        currentSum = 0
        for i in range(0, n):
            currentSum += nums[i]
        return totalSum - currentSum

class Solution:
    def nextPermutation(self, nums) -> None:
        n = len(nums)
        k = -1
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                k = i
                break

        if k == -1:
            nums.reverse()
            return

        for i in range(n - 1, k, -1):
            if nums[i] > nums[k]:
                nums[i], nums[k] = nums[k], nums[i]
                break
        self.reverse(nums, k + 1, n - 1)

    def reverse(self, nums, start, end):
        while start <= end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

class Solution:
    def rotate(self, nums, k) -> None:
        k = k%len(nums)
        if k!=0:
            nums[:k],nums[k:]=nums[-k:],nums[:-k]
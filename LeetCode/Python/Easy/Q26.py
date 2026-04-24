class Solution:
    def removeDuplicates(self, nums) -> int:
        if len(nums) == 0:
            return 0
        j = 0
        for i in range(0 , len(nums)):
            if nums[j] != nums[i]:
                j+=1
                nums[j] = nums[i]
            
        return j+1
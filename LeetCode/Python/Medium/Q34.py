class Solution:
    def searchRange(self, nums, target):
        def findFirst():
            start, end = 0, len(nums) - 1
            ans = -1
            while start <= end:
                mid = start + (end - start) // 2
                if nums[mid] == target:
                    ans = mid
                    end = mid -1
                elif nums[mid] < target:
                    start = mid + 1
                else:
                    end = mid - 1

            return ans

        def findLast():
            start, end = 0, len(nums) - 1
            ans = -1
            while start <= end:
                mid = start + (end - start) // 2
                if nums[mid] == target:
                    ans = mid
                    start = mid + 1
                elif nums[mid] < target:
                    start = mid + 1
                else:
                    end = mid - 1

            return ans
        return [findFirst(),findLast()]

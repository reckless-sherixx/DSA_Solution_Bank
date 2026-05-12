class Solution:
    def minEatingSpeed(self, piles, h) -> int:
        def canFinish(k: int) -> bool:
            hours = 0
            for pile in piles:
                hours += pile // k
                if pile % k != 0:
                    hours += 1
                if hours > h:
                    return False
            return True

        start, end = 1, max(piles)
        ans = end
        while start <= end:
            mid = start + (end - start) // 2
            if canFinish(mid):
                ans = mid
                end = mid - 1
            else:
                start = mid + 1
        return ans

class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        def no_of_bouquets(bloomDay, mid, k):
            num_of_bouquets = 0
            count = 0

            for day in bloomDay:
                if day <= mid:
                    count += 1
                else:
                    count = 0
                if count == k:
                    num_of_bouquets += 1
                    count = 0

            return num_of_bouquets

        if m * k > len(bloomDay):
            return -1
        start, end = 0, max(bloomDay)
        minDays = -1
        while start <= end:
            mid = start + (end - start) // 2

            if no_of_bouquets(bloomDay, mid, k) >= m:
                minDays = mid
                end = mid - 1
            else:
                start = mid + 1
        return minDays

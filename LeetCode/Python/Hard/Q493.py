class Solution:
    def reversePairs(self, nums) -> int:
        def merge_arr(left, right):
            result = []
            i = j = 0
            n, m = len(left), len(right)

            count = 0
            k = 0
            for l in range(n):
                while k < m and left[l] > 2 * right[k]:
                    k += 1
                count += k

            i = j = 0
            while i < n and j < m:
                if left[i] <= right[j]:
                    result.append(left[i])
                    i += 1
                else:
                    result.append(right[j])
                    j += 1

            while i < n:
                result.append(left[i])
                i += 1

            while j < m:
                result.append(right[j])
                j += 1

            return result, count

        def merge_sort(arr):
            if len(arr) <= 1:
                return arr, 0

            mid = len(arr) // 2
            left, count_left = merge_sort(arr[:mid])
            right, count_right = merge_sort(arr[mid:])

            merged, count_merge = merge_arr(left, right)

            return merged, count_left + count_right + count_merge

        _, count = merge_sort(nums)
        return count

class Solution:
    def searchMatrix(self, matrix, target) -> bool:
        m, n = len(matrix), len(matrix[0])
        start, end = 0, m * n - 1

        while start <= end:
            mid = start + (end - start) // 2
            if matrix[mid // n][mid % n] == target:
                return True
            elif matrix[mid // n][mid % n] < target:
                start = mid + 1
            else:
                end = mid - 1
        return False
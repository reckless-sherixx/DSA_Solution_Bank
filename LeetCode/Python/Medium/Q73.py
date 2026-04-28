class Solution:
    def setZeroes(self, matrix) -> None:
        m = len(matrix)
        n = len(matrix[0])

        r = [False] * m
        c = [False] * n

        for i in range(0, m):
            for j in range(0, n):
                if matrix[i][j] == 0:
                    r[i] = True
                    c[j] = True

        for i in range(0, m):
            for j in range(0, n):
                if r[i] or c[j]:
                    matrix[i][j] = 0

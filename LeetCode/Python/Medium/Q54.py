class Solution:
    def spiralOrder(self, matrix):
        m, n = len(matrix), len(matrix[0])
        mat = []
        rStart, rEnd = 0, m - 1
        cStart, cEnd = 0, n - 1
        while rStart <= rEnd and cStart <= cEnd:
            for i in range(cStart, cEnd + 1):
                mat.append(matrix[rStart][i])
            rStart += 1
            for i in range(rStart, rEnd + 1):
                mat.append(matrix[i][cEnd])
            cEnd -= 1
            if rStart <= rEnd:
                for i in range(cEnd, cStart - 1, -1):
                    mat.append(matrix[rEnd][i])
                rEnd -= 1
            if cStart <= cEnd:
                for i in range(rEnd, rStart - 1, -1):
                    mat.append(matrix[i][cStart])
                cStart += 1
        return mat

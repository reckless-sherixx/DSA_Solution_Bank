class Solution:
    def rotateTheBox(self, boxGrid):
        n = len(boxGrid)
        m = len(boxGrid[0])

        result = [["" for _ in range(n)] for _ in range(m)]

        for i in range(n):
            for j in range(m):
                result[j][n - 1 - i] = boxGrid[i][j]

        for j in range(n):
            lowest_row_with_empty_cell = m - 1
            for i in range(m - 1, -1, -1):
                if result[i][j] == "#":
                    result[i][j], result[lowest_row_with_empty_cell][j] = (
                        result[lowest_row_with_empty_cell][j],
                        result[i][j],
                    )
                    lowest_row_with_empty_cell -= 1
                if result[i][j] == "*":
                    lowest_row_with_empty_cell = i - 1

        return result
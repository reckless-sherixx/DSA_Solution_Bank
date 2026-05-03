class Solution:
    def merge(self, intervals):
        intervals.sort()
        result = []
        
        r = len(intervals)
        
        start = intervals[0][0]
        end = intervals[0][1]
        
        for i in range(1, r):
            curr_start = intervals[i][0]
            curr_end = intervals[i][1]
            
            if curr_start <= end:
                end = max(end, curr_end)
            else:
                result.append([start, end])
                start = curr_start
                end = curr_end
        
        result.append([start, end])
        
        return result
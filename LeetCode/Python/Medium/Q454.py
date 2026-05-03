from collections import defaultdict
class Solution:
    def fourSumCount(self, nums1, nums2, nums3, nums4):
        n = len(nums1)
        hash_map = defaultdict(int)
        res = 0

        for i in range(n):
            for j in range(n):
                hash_map[nums1[i] + nums2[j]] += 1

        for k in range(n):
            for l in range(n):
                res += hash_map.get(-(nums3[k] + nums4[l]), 0)

        return res

package LeetCode.Medium;

import java.util.Arrays;

public class Q1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = Arrays.stream(nums).max().getAsInt();
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isSmallestDivisor(nums, mid, threshold)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private boolean isSmallestDivisor(int[] nums, int mid, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + mid - 1) / mid;
        }
        return sum <= threshold;
    }
}

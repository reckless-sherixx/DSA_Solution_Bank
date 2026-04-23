package LeetCode.Medium;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int smallestNumber = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        if (maxSum == 0) {
            for (int i = 0; i < nums.length; i++) {
                if (smallestNumber < nums[i]) {
                    smallestNumber = nums[i];
                }
                maxSum = smallestNumber;
            }
        }
        return maxSum;
    }
}

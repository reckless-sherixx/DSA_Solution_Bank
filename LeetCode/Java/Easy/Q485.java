package LeetCode.Easy;

public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag++;
                count = Math.max(count, flag);
            } else {
                flag = 0;
            }
        }
        return count;
    }
}

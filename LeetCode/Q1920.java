package LeetCode;

public class Q1920 {
    public int[] buildArray(int[] nums) {
        // TS: O(n) , SC: O(1);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;

        // TS: O(n) , SC: O(n);

        // int[] ans = new int[nums.length];
        // for(int i = 0 ; i< nums.length ; i++){
        // ans[i] = nums[nums[i]];
        // }
        // return ans;
    }
}
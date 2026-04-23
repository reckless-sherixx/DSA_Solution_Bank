package LeetCode.Medium;

public class Q1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;
        int end = 0;
        for (int day : bloomDay) {
            end = Math.max(end, day);
        }

        int minDays = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (getNumOfBouquets(bloomDay, mid, m, k) >= m) {
                minDays = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minDays;
    }

    public int getNumOfBouquets(int[] arr, int day, int m, int k) {
        int numOfBouquets = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                numOfBouquets += (count / k);
                count = 0;
            }
        }
        numOfBouquets += (count / k);

        return numOfBouquets;
    }
}

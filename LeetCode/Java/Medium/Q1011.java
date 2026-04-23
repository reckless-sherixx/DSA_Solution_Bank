package LeetCode.Medium;

public class Q1011 {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = -1, totalWeight = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        int s = maxWeight, e = totalWeight;
        int ans = e;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (canShipWithinDays(weights, m, days)) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

    private boolean canShipWithinDays(int[] weights, int mid, int days) {
        int currDays = 1;
        int load = 0;
        for (int weight : weights) {
            if (load + weight > mid) {
                currDays++;
                load = 0;
            }
            load += weight;
        }
        return currDays <= days;
    }
}

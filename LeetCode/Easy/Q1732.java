package LeetCode.Easy;

public class Q1732 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = Integer.MIN_VALUE;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        if (maxAltitude > 0) {
            return maxAltitude;
        }
        return 0;
    }
}
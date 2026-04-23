package LeetCode.Easy;

public class Q3516 {
    public int findClosest(int x, int y, int z) {
        int totalDistancex1 = Math.abs(x - z);
        int totalDistancex2 = Math.abs(y - z);
        if (totalDistancex1 < totalDistancex2) {
            return 1;
        } else if (totalDistancex1 > totalDistancex2) {
            return 2;
        } else {
            return 0;
        }

    }
}
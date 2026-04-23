package LeetCode.Hard;

public class Q1095 {
    public int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakElement(mountainArr);
        int left = search(mountainArr, target, 0, peak, true);
        if (left != -1) {
            return left;
        }
        return search(mountainArr, target, peak + 1, mountainArr.length - 1, false);
    }

    int search(int[] arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr[mid];

            if (val == target) {
                return mid;
            }
            if (isAsc) {
                if (target < val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

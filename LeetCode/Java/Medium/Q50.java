package LeetCode.Medium;

public class Q50 {
    public double myPow(double x, int n) {
        if (n > 0)
            return recFunc(x, n);
        return 1 / recFunc(x, n);
    }

    private double recFunc(double x, long n) {
        if (n == 0)
            return 1.0;
        double res = recFunc(x, n / 2);
        res = res * res;
        if (n % 2 == 0)
            return res;
        return x * res;
    }
}

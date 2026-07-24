public class Solution {
    public int climbStairs(int n) {
        int f1 = 1, f2 = 1;

        for (int i = 0; i < n - 1; i++) {
            int t = f1;
            f1 = f1 + f2;
            f2 = t;
        }

        return f1;
    }
}
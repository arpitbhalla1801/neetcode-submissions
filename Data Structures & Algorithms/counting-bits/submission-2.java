class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        for(int i=1;i<n+1;i++) {
            dp[i] = (i&1) + dp[i >> 1]; 
        }
        return dp;
    }
}

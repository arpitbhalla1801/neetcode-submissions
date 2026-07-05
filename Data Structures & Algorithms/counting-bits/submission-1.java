class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        int p=1;
        dp[0]=0;
        for(int i=1;i<n+1;i++) {
            if(p*2==i) p=i;
            dp[i] = 1 + dp[i-p];
        }
        return dp;
    }
}

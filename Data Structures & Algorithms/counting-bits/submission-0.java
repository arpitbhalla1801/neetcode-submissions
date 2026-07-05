class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<n+1;i++) {
            int k=i;
            while(k!=0) {
                k &= (k-1);
                res[i]++;
            }
        }
        return res;
    }
}

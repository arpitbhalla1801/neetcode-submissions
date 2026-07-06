class Solution {
    public int reverseBits(int n) {
        int in=0;
        int res=0;
        while(n!=0) {
            int bit = n & 1;
            if(bit==1) {
                res = res | (1 << (31-in));
            }
            n = n >>> 1;
            in++;
        }

        return res;
    }
}

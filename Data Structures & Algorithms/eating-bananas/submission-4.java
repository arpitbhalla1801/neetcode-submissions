class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=Integer.MIN_VALUE;
        for(int p: piles) {
            if(p>r) r=p;
        }
        int k = r;
        while(l <= r) {
            int mid = (l+r)/2;

            long t = 0;
            for(int p: piles) {
                t += (int) Math.ceil((double) p/mid); 
            }

            if(t<=h) {
                k=mid;
                r=mid-1;
            } else l=mid+1;
        }
        return k;
    }
}

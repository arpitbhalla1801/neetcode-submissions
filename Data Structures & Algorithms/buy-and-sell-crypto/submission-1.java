class Solution {
    public int maxProfit(int[] prices) {
        int l = Integer.MAX_VALUE;
        int p = 0;
        for(int x: prices) {
            if(x < l) l=x;
            p=Math.max(p, x-l); 
        }
        return p;
    }
}

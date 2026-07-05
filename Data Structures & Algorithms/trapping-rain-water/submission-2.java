class Solution {
    public int trap(int[] height) {
        int f=0;
        int r=height.length-1;
        int res=0;
        int l1=height[f];
        int r1=height[r];
        while(f<r) {
            if(l1 < r1) {
                f++;
                l1=Math.max(l1, height[f]);
                res+=l1 - height[f];                            
            } else {
                r--;
                r1=Math.max(r1, height[r]);
                res+=r1-height[r];
            }
        }
        return res;
    }
}

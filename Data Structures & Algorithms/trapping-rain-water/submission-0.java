class Solution {
    public int trap(int[] height) {
        int res=0;
        for(int i=1;i<height.length-1;i++) {
            int l=height[i];
            int r=height[i];
            for(int j=i-1;j>-1;j--) {
                if(height[j] > l) l=height[j];
            }
            for(int k=i+1;k<height.length;k++) {
                if(height[k] > r) r=height[k];
            }
            res+=Math.min(l,r)-height[i];
        }
        return res;
    }
}

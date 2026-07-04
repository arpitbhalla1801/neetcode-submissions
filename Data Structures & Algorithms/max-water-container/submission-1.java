class Solution {
    public int maxArea(int[] heights) {
        int f = 0;
        int r = heights.length-1;
        int max = 0;
        while(f < r) {
            max = Math.max(max, Math.min(heights[r],heights[f]) * Math.abs(r-f));
            if(heights[r]>heights[f]) f++;
            else if(heights[f]>=heights[r]) r--;
        }
        return max;
    }
}
